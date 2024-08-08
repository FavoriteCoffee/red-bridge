<template>
    <div id="fbform">
        <h2>оставить заявку</h2>
        <div class="fbform">
            <div class="fbform-text">
                <input class="fbform-input" placeholder="Ваше имя" minlength="1" maxlength="100"/>
            </div>
            <div class="fbform-text">
                <input class="fbform-input" placeholder="Email" minlength="1" maxlength="100"/>
            </div>
            <div class="fbform-text">
                <input class="fbform-input" placeholder="Телефон" minlength="1" maxlength="100"/>
            </div>
            <div id="dfform-textarea" class="fbform-text">
                <textarea id="dfform-textarea-input" class="fbform-input" placeholder="Краткое описание необходимого оборудования" minlength="1" maxlength="100"></textarea>
            </div>
        </div>
        <button class="fbform-button">
                отправить
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
.fbform-input{
    border: none;
    outline: none;
    font-size: 14px;
    color: #767676;
    background-color: white;
    height: 50px;
    width: 220px;
}

.fbform{
    color: black;
    
}

.fbform-text{
    border: 0.1em solid black;
    display: inline-flex;
    padding-left: 20px;
    width: 254px;
    background-color: white;
    margin-bottom: 23px;

}

.v-text-field{
    font-family: 'Montserrat', sans-serif;
    color: #767676;
    border: solid;
    height: 50px;
    width: 260px;
    margin-bottom: 50px;
    border-color: black;
    border-radius: 0%;
    border-width: 0.05em;
}

.fbform-button{
    margin-bottom: 23px;
    color: white;
    font-size: 14px;
    font-weight: bold;
    text-transform: uppercase;
    background-color: #f9283b;
    width: 255px;
    height: 42px;
    border-radius: 30px;
}

h2{
    font-size: 24px;
    text-transform: uppercase;
    margin-bottom: 27px;
    margin-top: 27px;
}

#dfform-textarea-input{
    margin: 0;
    padding-right: 20px;
    width: 234px;
}

#fbform{
    background-color: #f5f5f5;
    color: black;
    height: 530px;
    width: 300px;
    float: right;
    padding: 23px;
    padding-top: 0%;
    margin: 20px 10% 20px 3%;    
}

#dfform-textarea{
    max-height: 150px;
    min-height: 120px;
    padding: 0 0 0 20px;
}
</style>