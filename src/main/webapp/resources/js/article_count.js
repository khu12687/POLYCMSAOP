$(function() {
		// 조회
		ajax_article_count({ type: "ref_count" });
		
		// 좋아요
		$("#good_count button").click(function() {			
			ajax_article_count({ type: "good_count" });
		});
		
		// 싫어요
		$("#bad_count button").click(function() {
			ajax_article_count({ type: "bad_count" });
		});
})

function ajax_article_count(item) {
	$.ajax("", {
			method: "POST",
			contentType: "application/json",
			dataType: "json",
			data: JSON.stringify(item),
			success: result => {
				console.log(`[성공] ${item.type} 수 증가: ${result}`);
				
				const count = $(`#${item.type} p`).text();				
				$(`#${item.type} p`).text( Number(count) + 1 );
			},
			error: (xhr, result) => console.log(`[실패] ${item.type} 수 증가: ${result}`)
		}
	);
}