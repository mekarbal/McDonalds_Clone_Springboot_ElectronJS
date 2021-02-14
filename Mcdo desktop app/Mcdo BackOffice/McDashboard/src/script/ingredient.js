var ingTable = document.getElementById("myTbody")

axios.get("http://localhost:5000/ingredient")
     .then(response =>{
         var html = response.data.map(ingredient =>{
             return `
             <tr>
             <td>
                ${ingredient.ingredientName}
             </td>
             <td class="text-center">
                 <button type="button" class="btn btn-success btn-sm" onclick="updateIng('${ingredient.id}')">Update</button>
                 <button type="button" class="btn btn-danger btn-sm" onclick="deleteIng('${ingredient.id}')">Delete</button>
             </td>
         </tr>
             `
         }).join(" ")

         ingTable.innerHTML = html
     })

async function addIng(){
     var ingName = document.getElementById("ingName").value
    

     await axios.post("http://localhost:5000/ingredient",{
      ingredientName : ingName
     }).then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });

}



async function updateIng(id){

    var ingName = document.getElementById("ingName").value

    await axios.put("http://localhost:5000/ingredient/"+id,{
      ingredientName : ingName
     }).then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });
}
async function deleteIng(id){

    await axios.delete("http://localhost:5000/ingredient/"+id)
         .then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });
}