var subCatSelect = document.getElementById('subCatSelect')
var ingSelect = document.getElementById('ingSelect')
var prodTable = document.getElementById("myTbody")

axios.get("http://localhost:5000/subcategory")
     .then(response =>{
         var html = response.data.map(subcategory =>{
             return `
             <option value="${subcategory.id}">${subcategory.subcategoryName}</option>
             `
         }).join(" ")

         subCatSelect.innerHTML = html
     })
axios.get("http://localhost:5000/ingredient")
     .then(response =>{
         var html = response.data.map(ingredient =>{
             return `
             <option value="${ingredient.id}">${ingredient.ingredientName}</option>
             `
         }).join(" ")

         ingSelect.innerHTML = html
     })

axios.get("http://localhost:5000/products")
     .then(response =>{
         var html = response.data.map(product =>{
             return `
             <tr>
             <td>
                ${product.productName}
             </td>
             <td>
                ${product.img}
             </td>
             <td>
                ${product.productPrice}
             </td>
             <td class="text-center">
                 <button type="button" class="btn btn-success btn-sm" onclick="updateProduct('${product.id}')">Update</button>
                 <button type="button" class="btn btn-danger btn-sm" onclick="deleteProduct('${product.id}')">Delete</button>
             </td>
         </tr>
             `
         }).join(" ")

         prodTable.innerHTML = html
     })

async function addProduct(){

   var prodName = document.getElementById("prodName").value
   var prodImg = document.getElementById("prodImg").value
   var prodPrice = parseInt(document.getElementById("prodPrice").value)
   var subCatId = Number(document.getElementById("subCatSelect").value)
   var ingId = Number(document.getElementById("ingSelect").value)


    await axios.post("http://localhost:5000/products",{
        productName : prodName,
        img : prodImg,
        productPrice : prodPrice,
        id_subcategory: subCatId,
        id_ingredient : ingId

     }).then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });


}

async function updateProduct(id){

    var prodName = document.getElementById("prodName").value
    var prodImg = document.getElementById("prodImg").value
    var prodPrice = parseInt(document.getElementById("prodPrice").value)
    var subCatId = Number(document.getElementById("subCatSelect").value)
    var ingId = Number(document.getElementById("ingSelect").value)



    await axios.put("http://localhost:5000/products/"+id,{

        productName : prodName,
        img : prodImg,
        productPrice : prodPrice,
        id_subcategory: subCatId,
        id_ingredient : ingId

     }).then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });
}
async function deleteProduct(id){

    await axios.delete("http://localhost:5000/products/"+id)
         .then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });
}


