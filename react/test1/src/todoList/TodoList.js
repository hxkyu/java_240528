import { useState } from "react";

function TodoList(){

	let [todo, setTodo] = useState("");
	let [todoList, setTodoList] = useState([]);

	function change(e){
		setTodo(e.target.value);
	}
	function add(){
		setTodoList([...todoList, todo]); 
	}
	return (
		<div>
			<input onChange={change}/>
			<button onClick={add}>추가</button>
			<h1>오늘의 할일</h1>
			<ul>
			{
				todoList.map((value)=>{
					return <li>{value}</li>
				})
			}

			</ul>
		</div>
	)
}
export default TodoList;