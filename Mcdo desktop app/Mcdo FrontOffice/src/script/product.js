let params = new URLSearchParams(location.search);
var subCatId = params.get('subcatid')
var subCatName = params.get('subCatname')
var products = document.getElementById('product')
var loc = params.get('loc')

document.getElementById('subCatName').innerHTML = subCatName

axios.get('http://localhost:5000/products/Sub/'+subCatId)
     .then( response => {
         var html = response.data.map(product => {
             return `
                        <a href="commande.html?prodId=${product.id}&prodName=${product.productName}&extraId=${product.id_ingredient}&loc=${loc}" class="col-md-4 d-flex flex-column align-items-center">
                            <img src="./img/${product.img}" alt="">
                            <h3 class="mt-5">${product.productName}</h3>
                            <div class="price">${product.productPrice} DH</div>
                        </a>
             `
         }).join(' ')

         products.innerHTML = html
     })

