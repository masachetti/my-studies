var counterNumWrapper = document.getElementById("counter-number");
var counterNum = 0;

decrement = () => changeView(--counterNum);

increment = () => changeView(++counterNum);

// function decrement(){
//     counterNumWrapper.innerHTML = --counterNum;
// }

// function increment(){
//     counterNumWrapper.innerHTML = ++counterNum;
// }

function changeView(num){
    counterNumWrapper.innerHTML = num;
    if (num > 0){
        counterNumWrapper.style.color = 'blue';
    }
    else if (num < 0){
        counterNumWrapper.style.color = 'red';
    }
    else{
        counterNumWrapper.style.color = 'black';
    }
}