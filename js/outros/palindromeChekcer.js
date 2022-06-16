function isPalindrome(text){
    let joinedText = text.replaceAll(" ", "").toUpperCase();
    for (let i = 0, j = joinedText.length-1; ~~(i < joinedText.length/2); i++,j--) {
        if (joinedText[i] !== joinedText[j])
            return false;
    }
    return true;
}

var check = isPalindrome("roma me tem amor");
console.log(`${check?'Is':'Is not'} a palindrome!`);