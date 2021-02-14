function getLang(a) {
    localStorage.setItem('Lang', a);
    location.reload()

}


arrLang = {
    en : {
        "categories":"CATEGORY",
        "back":"Back",
        "dining" : "DINING LOCATION",
        "in" : "Take in",
        "out" : "Take out",
        "payement" : "HOW WOULD YOU LIKE TO PAY ?",
        "cc" : "CREDIT CARD",
        "cash" : "CASH AT COUNTER",
        "extra" : "Extra :",
        "addExtra" : "Add Extra",
        "prodQuantity" : "Product Quantity :",
        "tableServ" : "Table service number :",
        "promoCode" : "Promo code :",
        "check" : "Check",
        "fideleCode" : "Fidelity card code :",
        "congrats" : "Congratulations !",
        "effectuer" : "Your order has been successfully completed !",
        "close" : "Close"
    },
    fr : {
        "categories":"CATEGORIE",
        "back":"Retour",
        "dining" : "OPTIONS DE RESTAURATION",
        "in" : "Sur place",
        "out" : "Emporté",
        "payement" : "COMMENT VOUDEREZ-VOUS PAYER ?",
        "cc" : "CARTE CREDIT",
        "cash" : "PAYER EN ESPÈCES",
        "extra" : "Supplémentaire :",
        "addExtra" : "Ajouter supplémentaire",
        "prodQuantity" : "Quantité de produit :",
        "tableServ" : "Numéro de service à table :",
        "promoCode" : "Code promo :",
        "check" : "Vérifier",
        "fideleCode" : "Code carte fidélité :",
        "congrats" : "Félicitations !",
        "effectuer" : "Votre commande a été bien effectuer !",
        "close" : "Fermer"
    },

    ar : {
        "categories":"الفئة",
        "back":"عودة",
        "dining" : "مكان تناول الطعام",
        "in" : "في المنطقة",
        "out" : "حمَل ",
        "payement" : "كيف تريد الدفع ؟",
        "cc" : "بطاقة إئتمان",
        "cash" : "الدفع نقدا",
        "extra" : "إضافي :",
        "addExtra" : "أضف إضافي",
        "prodQuantity" : "كمية المنتج :",
        "tableServ" : "رقم خدمة الطاولة :",
        "promoCode" : "رمز ترويجي",
        "check" : "تحقق",
        "fideleCode" : "رمز بطاقة الإخلاص :",
        "congrats" : "تهانينا !",
        "effectuer" : "تم إكمال طلبك بنجاح! !",
        "close" : "اغلاق"
    }
  

}

function translate() {
    var elements = document.getElementsByClassName('lang')
    var lang = localStorage.getItem("Lang")

    for (let index = 0; index < elements.length; index++) {
        elements.item(index).innerHTML = arrLang[lang][elements.item(index).getAttribute('key')];
    }
}

