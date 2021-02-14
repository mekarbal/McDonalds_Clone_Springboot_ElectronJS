var html="";


axios.get('http://localhost:5000/products')
.then( response => {
    var arr = [];
    while(arr.length < 7){
        var r =  Math.floor(Math.random()*response.data.length)
        if(arr.indexOf(r) === -1) arr.push(r);
    }
    for (let index = 1; index <= 6; index++) {
        
       console.log(arr[index])
        html +=  `
                <div class="rec-prod d-flex justify-content-center align-items-center flex-column mt-5">
                    <img src="./img/${response.data[arr[index]].img}" alt="">
                    <h4 class="text-center">${response.data[arr[index]].productName}</h4>
                </div>
                `
        
    }

    document.getElementById("randprod").innerHTML = html
})