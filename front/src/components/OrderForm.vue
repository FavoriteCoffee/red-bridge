<template>
    <div id="fbform">
        <p class="fbform-title">сделать заказ оборудования</p>
        <div>
            <div class="fbform-text">
                <input class="fbform-input" placeholder="Ваше имя" minlength="1" maxlength="100"/>
            </div>
            <div class="fbform-text">
                <input class="fbform-input" placeholder="Email" minlength="1" maxlength="100"/>
            </div>
            <div class="fbform-text">
                <input class="fbform-input" placeholder="Телефон" minlength="1" maxlength="100"/>
            </div>
            <div class="fbform-text">
                <input class="fbform-input" placeholder="Тема сообщения" minlength="1" maxlength="100"/>
            </div>
            <div id="dfform-textarea" class="fbform-text">
                <textarea id="dfform-textarea-input" class="fbform-input" placeholder="Сообщение" minlength="1" maxlength="1000"></textarea>
            </div>
        </div>
        <button class="fbform-button">
                заказать
        </button>
    </div>
</template>

<script setup>
    import { ref, computed } from 'vue';

    const firstname = ref("")
    const valid = ref("")
    const email = ref("")
    const lastname = ref("")
    

</script>

<style>
h2{
    font-size: 24px;
    text-transform: uppercase;
    margin-bottom: 25px;
    margin-top: 25px;
    font-weight: bold;
}
</style>


<style scoped>
.fbform-input{
    border: none;
    outline: none;
    font-size: 14px;
    color: #767676;
    background-color: white;
    height: 50px;
    width: 220px;
}




.fbform-text{
    border: 0.1em solid black;
    display: inline-flex;
    padding-left: 20px;
    background-color: white;
    margin-bottom: 23px;

}

.fbform-title{
    font-size: 22px;
    text-transform: uppercase;
    margin-bottom: 20px;
    font-weight: bold;
}

.v-text-field{
    font-family: 'Montserrat', sans-serif;
    color: #767676;
    border: solid;
    /* длина сообщения 1000 символов */
    border-color: black;
    border-radius: 0%;
    border-width: 0.05em;
}

.fbform-button{
    
    color: white;
    font-size: 14px;
    font-weight: bold;
    text-transform: uppercase;
    background-color: #f9283b;
    width: 100%;
    height: 42px;
    border-radius: 30px;
}


#dfform-textarea-input{
    margin: 0;
    padding-top: 20px;
    height: auto;
}

#fbform{
    background-color: #f5f5f5;
    color: black;
    width: 280px;
    float: right;
    padding: 20px;
    margin-top: 20px;
       
}

#dfform-textarea{
    height: 120px;
    padding: 0 0 0 20px;
}
</style>