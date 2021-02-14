var categories = document.getElementById('categories')
let params = new URLSearchParams(location.search);
var loc = params.get('loc')

axios.get('http://localhost:5000/category')
     .then( response => {
         
         var html = response.data.map(category => {
             return `
                        <a href="subcat.html?catid=${category.id}&catname=${category.categoryname}&loc=${loc}" class="col-md-4 d-flex flex-column align-items-center">
                            <img src="./img/${category.img}" alt="">
                            <h3 class="mt-5">${category.categoryname}</h3>
                        </a>
             `
         }).join(' ')

         categories.innerHTML = html
     })


