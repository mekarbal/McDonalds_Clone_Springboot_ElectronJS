let params = new URLSearchParams(location.search);
var catId = params.get('catid')
var catName = params.get('catname')
var subCat = document.getElementById('subcat')
var loc = params.get('loc')

document.getElementById('catName').innerHTML = catName

axios.get('http://localhost:5000/subcategory/findsubCatByCatId/'+catId)
     .then( response => {
         var html = response.data.map(subCategory => {
             return `
                        <a href="product.html?subcatid=${subCategory.id}&subCatname=${subCategory.subcategoryName}&loc=${loc}" class="col-md-4 d-flex flex-column align-items-center">
                            <img src="./img/${subCategory.img}" alt="">
                            <h3 class="mt-5">${subCategory.subcategoryName}</h3>
                        </a>
             `
         }).join(' ')

         subCat.innerHTML = html
     })
