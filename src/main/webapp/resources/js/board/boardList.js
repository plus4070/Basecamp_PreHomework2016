'use strict';

(function($) {
	$(document).ready(function() {
		
		// 글쓰기 버튼
		$("#write").on("click", function(e) {
			e.preventDefault();
			writeBoard();
		});

		// 수정
		$("input[id^='edit']").on("click", function(e) {
			e.preventDefault();
			if (confirm("수정하시겠습니까?") == true) {
				editBoard($(this));
			} else {
				return;
			}
		});

		// 삭제
		$("input[id^='delete']").on("click", function(e) {
			e.preventDefault();
			if (confirm("삭제하시겠습니까?") == true) {
				deleteBoard($(this));
			} else {
				return;
			}
		});
	});

	function writeBoard() {
		var writeFormUrl = '/board/writeForm';
		$(location).attr('href', writeFormUrl);
	}
	
	function deleteBoard($target){
		var targetId = $target.attr('id').substring(6, 8);
		var board = {
				boardId : targetId
		};
		
		$.ajax({
			url : '/board/delete',
			type : 'delete',
			data : JSON.stringify(board),
			contentType : 'application/json; charset=UTF-8',
			success : function(data) {
				alert('삭제되었습니다.');
				location.reload();
			},
			error : function(data) {
				alert('삭제에 실패했습니다. 다시 시도해주세요.');
			}
		});
	}

})(jQuery);