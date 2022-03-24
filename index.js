const api ='https://run.mocky.io/v3/010e898c-a05c-4a0a-b947-2a65b5a267c5';
let currentname="";
function getData(){
    fetch(api).then((data)=>{
        return data.json();
    }).then((object)=>{
        let tabledata="";
        object.map((values)=>{
            tabledata+=`<tr>
            <td>${values.first_name}</td>
            <td>${values.last_name}</td>
            <td>${values.username}</td>
            <td>${values.employment.title}</td>
            <td>${values.address.country}</td>
            </tr>`;
        });
        document.getElementById("data").innerHTML=tabledata;
    }).catch((err)=>{
        console.log(err);
    });
 }
getData();
// console.log(currentname);
function defaultvalue(){
    fetch(api).then((data)=>{
        return data.json();
    }).then((object)=>{
        
        let data="";
        data += `<dl>
        <dt>General info : </dt>
        <dd>id : ${object[0].id}</dd>
        <dd>uid : ${object[0].uid}</dd>
        <dd>password : ${object[0].password}</dd>
        <dd>name : ${object[0].first_name} ${object[0].last_name}</dd>
        <dd>username : ${object[0].username}</dd>
        <dd>email : ${object[0].email}</dd>
        <dd>gender : ${object[0].gender}</dd>
        <dd>phone_number : ${object[0].phone_number}</dd>
        <dd>social insurance number : ${object[0].social_insurance_number}</dd>
        <dd>date of birth : ${object[0].date_of_birth}</dd>
        <dd>Employment title : ${object[0].employment.title}</dd>
        <dd>Employment key_skill : ${object[0].employment.key_skill}</dd>
        <dt>Address : </dt>
        <dd>city : ${object[0].address.city}</dd>
        <dd>street : ${object[0].address.street_name}</dd>
        <dd>street address : ${object[0].address.street_address}</dd>
        <dd>zip code : ${object[0].address.zip_code}</dd>
        <dd>state : ${object[0].address.state}</dd>
        <dd>country : ${object[0].address.country}</dd>
        <dt>Credit Card :</dt>
        <dd>cc_number : ${object[0].credit_card.cc_number}</dd>
        <dt>Subscription : </dt>
        <dd>plan : ${object[0].subscription.plan}</dd>
        <dd>status : ${object[0].subscription.status}</dd>
        <dd>payment : ${object[0].subscription.payment_method}</dd>
        <dd>term : ${object[0].subscription.term}</dd>`;
        document.getElementById("dl").innerHTML=data;

        let currentname ="";
        currentname +=`<h2>${currentDisplay()} ${object[0].first_name}</h2>`;
        console.log(currentname);
            document.getElementById("greeting").innerHTML=currentname;
    });
}
defaultvalue();

function currentDisplay()
{
    
    let data="";
    var today=new Date();
    var current_Hr = today.getHours();
    if(current_Hr<12)
    {
        return 'Good Morning';
    }
    else if(current_Hr<18)
    {
        return 'Good Afternoon';
    }
    else
        return 'Good Evening';
}

function removeOnClick()
{
    return defaultvalue();
}
function onClick()
{
    let current_user = document.getElementById("uname").value;
    fetch(api).then((data)=>{
        return data.json();
    }).then((object)=>{

        for(var i=0;i<object.length;i++)
        {
            if(object[i].username==current_user)
            {
               
                let data="";
                data += `<dl>
                    <dt>General info : </dt>
                    <dd>id : ${object[i].id}</dd>
                    <dd>uid : ${object[i].uid}</dd>
                    <dd>password : ${object[i].password}</dd>
                    <dd>name : ${object[i].first_name} ${object[i].last_name}</dd>
                    <dd>username : ${object[i].username}</dd>
                    <dd>email : ${object[i].email}</dd>
                    <dd>gender : ${object[i].gender}</dd>
                    <dd>phone_number : ${object[i].phone_number}</dd>
                    <dd>social insurance number : ${object[i].social_insurance_number}</dd>
                    <dd>date of birth : ${object[i].date_of_birth}</dd>
                    <dd>Employment title : ${object[i].employment.title}</dd>
                    <dd>Employment key_skill : ${object[i].employment.key_skill}</dd>
                    <dt>Address : </dt>
                    <dd>city : ${object[i].address.city}</dd>
                    <dd>street : ${object[i].address.street_name}</dd>
                    <dd>street address : ${object[i].address.street_address}</dd>
                    <dd>zip code : ${object[i].address.zip_code}</dd>
                    <dd>state : ${object[i].address.state}</dd>
                    <dd>country : ${object[i].address.country}</dd>
                    <dt>Credit Card :</dt>
                    <dd>cc_number : ${object[i].credit_card.cc_number}</dd>
                    <dt>Subscription : </dt>
                    <dd>plan : ${object[i].subscription.plan}</dd>
                    <dd>status : ${object[i].subscription.status}</dd>
                    <dd>payment : ${object[i].subscription.payment_method}</dd>
                    <dd>term : ${object[i].subscription.term}</dd>`;
                    document.getElementById("dl").innerHTML=data;
                let currentname ="";
                currentname +=`<h2>${currentDisplay()} ${object[i].first_name}</h2>`;
                console.log(currentname);
                    document.getElementById("greeting").innerHTML=currentname;
                }
            
        }
        
        
    });
}
