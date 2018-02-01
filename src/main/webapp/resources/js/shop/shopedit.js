$(function() {

	//这里写了一个getQueryString的方法，判断它是编辑还是注册，如果访问路径有shopid的值，
	//说明是编辑，没有shopid表示是注册
	var shopId = getQueryString('shopId');

	var isEdit = shopId ? true : false;

	//var shopInfoUrl = '/o2o/shop/getshopbyid?shopId=1';
	var shopInfoUrl = '/o2o/shopadmin/getshopbyid?shopId=' + shopId;
	var initUrl = '/o2o/shopadmin/getshopinitinfo';
	
	//编辑或者是注册url
	var editShopUrl = '/o2o/shopadmin/registershop';
	if (isEdit) {
		//说明是编辑，因素shopid有值
		editShopUrl = '/o2o/shopadmin/modifyshop';
	}

	function getInfo(shopId) {
		$.getJSON(shopInfoUrl, function(result) {
			if (result.success) {
				var shop = result.data.shop;
				$('#shop-name').val(shop.shopName);
				$('#shop-addr').val(shop.shopAddr);
				$('#shop-phone').val(shop.phone);
				$('#shop-desc').val(shop.shopDesc);
				var shopCategory = '<option data-id="'
						+ shop.shopCategory.shopCategoryId + '" selected>'
						+ shop.shopCategory.shopCategoryName + '</option>';
				var tempAreaHtml = '';
				result.data.areaList.map(function(item, index) {
					tempAreaHtml += '<option data-id="' + item.areaId + '">'
							+ item.areaName + '</option>';
				});
				$('#shop-category').html(shopCategory);
				$('#shop-category').attr('disabled','disabled');
				$('#area').html(tempAreaHtml);
				$('#area').attr('data-id',shop.areaId);
			}
		});
	}

	function getCategory() {
		$.getJSON(initUrl, function(result) {
			if (result.success) {
				var tempHtml = '';
				var tempAreaHtml = '';
				result.data.shopCategoryList.map(function(item, index) {
					tempHtml += '<option data-id="' + item.shopCategoryId
							+ '">' + item.shopCategoryName + '</option>';
				});
				result.data.areaList.map(function(item, index) {
					tempAreaHtml += '<option data-id="' + item.areaId + '">'
							+ item.areaName + '</option>';
				});
				$('#shop-category').html(tempHtml);
				$('#shop-category').removeAttr('disabled');
				$('#area').html(tempAreaHtml);
			}
		});
	}

	if (isEdit) {
		getInfo(shopId);
	} else {
		getCategory();
	}

	$('#submit').click(function() {
		var shop = {};

		shop.shopName = $('#shop-name').val();
		shop.shopAddr = $('#shop-addr').val();
		shop.phone = $('#shop-phone').val();
		shop.shopDesc = $('#shop-desc').val();

		shop.shopCategory = {
			shopCategoryId : $('#shop-category').find('option').not(function() {
				return !this.selected;
			}).data('id')
		};
		shop.area = {
			areaId : $('#area').find('option').not(function() {
				return !this.selected;
			}).data('id')
		};

		var shopImg = $("#shop-img")[0].files[0];
		var formData = new FormData();
		formData.append('shopImg', shopImg);
		formData.append('shopStr', JSON.stringify(shop));
		var verifyCodeActual = $('#j_captcha').val();
		if (!verifyCodeActual) {
			$.toast('请输入验证码！');
			return;
		}
		formData.append("verifyCodeActual", verifyCodeActual);
		$.ajax({
			url : editShopUrl,
			type : 'POST',
			// contentType: "application/x-www-form-urlencoded; charset=utf-8",
			data : formData,
			contentType : false,
			processData : false,
			cache : false,
			success : function(data) {
				if (data.success) {
					$.toast('提交成功！');
					if (isEdit){
						$('#captcha_img').click();
					} else{
						window.location.href="/shopadmin/shoplist";
					}
				} else {
					$.toast('提交失败！');
					$('#captcha_img').click();
				}
			}
		});
	});

});