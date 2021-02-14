var PromoTable = document.getElementById("myTbody")

axios.get("http://localhost:5000/codepromo")
     .then(response =>{
         var html = response.data.map(promocode =>{
             return `
             <tr>
             <td>
                ${promocode.code}
             </td>
             <td>
                ${promocode.redu}
             </td>
             <td>
                ${promocode.codestatus}
             </td>
             <td class="text-center">
                 <button type="button" class="btn btn-success btn-sm" onclick="updatePromoCode('${promocode.id}')">Update</button>
                 <button type="button" class="btn btn-danger btn-sm" onclick="deletePromoCode('${promocode.id}')">Delete</button>
             </td>
         </tr>
             `
         }).join(" ")

         PromoTable.innerHTML = html
     })

async function addPromoCode(){
     var promoCode = document.getElementById("code").value
     var reduc = document.getElementById("reduc").value

     await axios.post("http://localhost:5000/codepromo",{
        code : promoCode,
        redu : reduc,
        codestatus : true
     }).then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });

}



async function updatePromoCode(id){

    var promoCode = document.getElementById("code").value
    var reduc = document.getElementById("reduc").value



    await axios.put("http://localhost:5000/codepromo/"+id,{
        code : promoCode,
        redu : reduc,
        codestatus : true
     }).then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });
}
async function deletePromoCode(id){

    await axios.delete("http://localhost:5000/codepromo/"+id)
         .then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });
}