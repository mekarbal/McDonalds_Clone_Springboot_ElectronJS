var commandeTable = document.getElementById("myTbody")

axios.get("http://localhost:5000/commande")
     .then(response =>{
         var html = response.data.map(commande =>{
             return `
             <tr>
             <td>
                ${commande.price}
             </td>
             <td>
                ${commande.quantite}
             </td>
             <td>
                ${commande.tableserv}
             </td>
             <td>
                ${commande.promocode}
             </td>
             <td>
                ${commande.cardfidele}
             </td>
             <td>
                ${commande.way}
             </td>
             <td class="text-center">
                 <button type="button" class="btn btn-danger btn-sm" onclick="deleteCommande('${commande.id}')">Delete</button>
             </td>
         </tr>
             `
         }).join(" ")

         commandeTable.innerHTML = html
     })




async function deleteCommande(id){

    await axios.delete("http://localhost:5000/commande/"+id)
         .then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });
}