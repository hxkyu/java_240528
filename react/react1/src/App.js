//import './css/App.css'  폴더에 App.css가 있고, 연결할 때 사용

import Button from "./Button";



function App() {
  /*
  - arr1을 복사해서 arr2를 만들고 싶어서 다음과 같이 했더니 원하는 결과가 나타나지 않음
  - arr1과 arr2가 공유
  */
  var arr = [1,2,3];
   console.log(arr1);
   var arr2 = arr1; 
   console.log(arr2);
   arr2.push(4); //arr2에 4를 추가했더니
   console.log('-----------------')
   console.log(arr1); //arr1에 4가 같이 추가(하나를 공유해서 발생한결과)
  //arr3를 복사해서 arr4를 만들고 싶어서 전개 연산자를 사용했더니 원하는 결과가 나옴
  var arr3 = [1,2,3]; //전개연산자 : 배열이나 객체를 복사할때 사용
  console.log(arr3);
  arr4.push(4);
  console.log(arr3);

   return (
   <div>
    <button>버튼</button>
    <Button />
   </div>
  );
}

export default App;
