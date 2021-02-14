var catTable = document.getElementById("myTbody")

axios.get("http://localhost:5000/category")
     .then(response =>{
         var html = response.data.map(category =>{
             return `
             <tr>
             <td>
                ${category.categoryname}
             </td>
             <td>
                ${category.img}
             </td>
             <td class="text-center">
                 <button type="button" class="btn btn-success btn-sm" onclick="updateCat('${category.id}')">Update</button>
                 <button type="button" class="btn btn-danger btn-sm" onclick="deleteCat('${category.id}')">Delete</button>
             </td>
         </tr>
             `
         }).join(" ")

         catTable.innerHTML = html
     })

async function addCat(){
     var catName = document.getElementById("catName").value
     var catImg = document.getElementById("catImg").value

     await axios.post("http://localhost:5000/category",{
        categoryname : catName,
        img : catImg
     }).then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });

}



async function updateCat(id){

    var catName = document.getElementById("catName").value
    var catImg = document.getElementById("catImg").value

    console.log(catName);
    console.log(catImg);

    await axios.put("http://localhost:5000/category/"+id,{
        categoryname : catName,
        img : catImg
     }).then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });
}
async function deleteCat(id){

    await axios.delete("http://localhost:5000/category/"+id)
         .then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });
}