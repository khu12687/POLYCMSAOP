$(function() {
		// 조회
		const item = {
			type: "ref_count"
		};
		
		$.ajax("", {
			method: "POST",
			contentType: "application/json",
			dataType: "json",
			data: JSON.stringify(item),
			success: result => console.log(`[성공] 조회 수 증가: ${result}`),
			error: (xhr, result) => console.log(`[실패] 조회 수 증가: ${result}`)
			}
		);
		
		// 좋아요
		
		// 싫어요
		
})