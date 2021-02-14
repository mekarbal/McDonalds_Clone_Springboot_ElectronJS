var catSelect = document.getElementById('catSelect')
var subCatTable = document.getElementById("myTbody")

axios.get("http://localhost:5000/category")
     .then(response =>{
         var html = response.data.map(category =>{
             return `
             <option value="${category.id}">${category.categoryname}</option>
             `
         }).join(" ")

         catSelect.innerHTML = html
     })

axios.get("http://localhost:5000/subcategory")
     .then(response =>{
         var html = response.data.map(subcategory =>{
             return `
             <tr>
             <td>
                ${subcategory.subcategoryName}
             </td>
             <td>
                ${subcategory.img}
             </td>
             <td class="text-center">
                 <button type="button" class="btn btn-success btn-sm" onclick="updateSubCat('${subcategory.id}')">Update</button>
                 <button type="button" class="btn btn-danger btn-sm" onclick="deleteSubCat('${subcategory.id}')">Delete</button>
             </td>
         </tr>
             `
         }).join(" ")

         subCatTable.innerHTML = html
     })

async function addSubCat(){

    var subCatName = document.getElementById("subCatName").value
    var subCatImg = document.getElementById("subCatImg").value
    var catId = Number(document.getElementById("catSelect").value)

    console.log(subCatName);
    console.log(subCatImg);
    console.log(catId);

    await axios.post("http://localhost:5000/subcategory",{
        subcategoryName : subCatName,
        img : subCatImg,
        id_category : catId

     }).then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });


}

async function updateSubCat(id){

    var subCatName = document.getElementById("subCatName").value
    var subCatImg = document.getElementById("subCatImg").value
    var catId = Number(document.getElementById("catSelect").value)



    await axios.put("http://localhost:5000/subcategory/"+id,{
        subcategoryName : subCatName,
        img : subCatImg,
        id_category : catId

     }).then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });
}
async function deleteSubCat(id){

    await axios.delete("http://localhost:5000/subcategory/"+id)
         .then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });
}


