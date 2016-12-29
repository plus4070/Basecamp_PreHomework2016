'use strict';

(function($) {
	var boardUrl = '/board';
	
	$(document).ready(function() {
		// 목록으로
		$("#btnList").on("click", function(e) { 
			e.preventDefault();
			openBoardList();
		});

		// 작성하기
		$("#btnWrite").on("click", function(e) {
			e.preventDefault();
			insertBoard();
		});
	});

	function openBoardList() {
		$(location).attr('href', boardUrl);
	}

	function insertBoard() {
		var writeForm = $("#writeForm");
		
		var email = $("#BoardEmail").val();
		var password = $("#BoardPassword").val();
		var content = $("#content").val();
		
		var board = {boardEmail:email, boardPassword:password, boardContent:content};
		
		$.ajax({
			url: '/board/write',
			type: 'put',
			data: JSON.stringify(board),
			contentType: 'application/json; charset=UTF-8',
			success: function(data) {
				$(location).attr('href', boardUrl);
			},
			error: function(data) {
				console.log('글쓰기에 실패하였습니다. 다시 시도해주세요.');
			}
		});
	}

})(jQuery);
