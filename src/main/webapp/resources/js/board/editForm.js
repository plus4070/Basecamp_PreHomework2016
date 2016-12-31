'use strict';

(function ($) {
	$('#btnSubmit').on('click', function(e) {
		e.preventDefault();
		if($('#BOARDPASSWORD').val() == '') {
			alert('비밀번호를 입력하세요.');
		} else {
			editBoard();
		}
	})
	
	function editBoard() {
		var boardId = $('#BOARDID').val();
		var boardEmail = $('#BOARDEMAIL').val();
		var boardPassword = $('#BOARDPASSWORD').val();
		var boardContent = $('#BOARDCONTENT').val();
		
		var board = {
			boardId : boardId,
			boardEmail : boardEmail,
			boardPassword : boardPassword,
			boardContent : boardContent
		};
		
		$.ajax({
			url : '/board/edit',
			type : 'put',
			data : JSON.stringify(board),
			contentType : 'application/json; charset=UTF-8',
			success : function(data) {
				if(data == '') {
					alert('수정실패');
				} else {
					alert('수정되었습니다.');
					$(location).attr('href', '/board');
				}
			},
			error : function(data) {
				alert('비밀번호가 틀렸습니다. 다시 입력하세요.');
			}
		});
	}
	
})(jQuery);