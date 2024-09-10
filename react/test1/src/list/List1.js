import { useState } from "react";

/*다음과 같은 배열이 있을 때 배열을 이용해서 checkbox와 label태그로 된 화면을 구성하세요*/


function List1(){
		let [list, setList] = useState(['축구', '야구', '농구','배구','음악감상']);
	return(
		<div>
			<h1>당신의 취미는?</h1>
			{
				list.map(v=>{
					return(
						<label>
							<input type="checkbox" value={v}/> {v}
						</label>
					)
				})

			}
			<div></div>
		</div>
	)
}

export default List1;
