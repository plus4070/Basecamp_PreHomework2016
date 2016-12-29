'use strict';

(function($) {
	$(document).ready(function() {
		
		// 글쓰기 버튼
		$("#write").on("click", function(e) {
			e.preventDefault();
			boardWrite();
		});

		// 수정
		$("input[id^='edit']").on("click", function(e) {
			e.preventDefault();
			if (confirm("수정하시겠습니까?") == true) {
				boardEdit($(this));
			} else {
				return;
			}
		});

		// 삭제
		$("input[id^='delete']").on("click", function(e) {
			e.preventDefault();
			if (confirm("삭제하시겠습니까?") == true) {
				boardDelete($(this));
			} else {
				return;
			}
		});
	});

	function boardWrite() {
		var writeFormUrl = '/board/writeForm';
		$(location).attr('href', writeFormUrl);
	}

})(jQuery);