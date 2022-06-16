async function genNewCatImg(){
    let newCatImgUrl = await fetch('https://api.thecatapi.com/v1/images/search', {method: 'GET'})
    .then(response=>response.json()).then(json=>json[0]).then(obj=>obj.url);

    let catImgWrapper = document.getElementById('cat-img');
    catImgWrapper.src = newCatImgUrl;
    return newCatImgUrl
}

var url = genNewCatImg();
console.log(url);