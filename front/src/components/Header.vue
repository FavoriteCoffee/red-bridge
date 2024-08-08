<template>
    <div id="header_rec">
        <v-row id="header_nav">
            <a class="nav">линии</a>
            <a class="nav">техника </a>
            <a class="nav">новости</a>
            <a class="nav">видео</a>
        </v-row>
        <v-row>
            <h1>
                Красный мост
            </h1>
        </v-row>
        <v-row id="header_contacts1">
            +10 8613910036529
        </v-row>
        <v-row id="header_contacts2">
            +7 903 651-64-08
        </v-row>
        <v-row>
            <button class="header_button">
                заявка
            </button>
        </v-row>
    </div>
    <div id="triangle-topleft"></div>
</template>

<script setup>
</script>

<style>
body{
    font-family: 'Montserrat', sans-serif;
    background-color: white;
}
#triangle-topleft {
	width: 0;
	height: 0;
    float: left;
    margin: 0;
	border-top: 270px solid #BC1E2d; 
	border-right: 270px solid transparent;			
}
#header_rec{
    color: white;
    background-color: #BC1E2d;
    padding-left: 100px;
    padding-top: 35px;
    height: 270px;
    width: 50%;
    float: left;
}
div.v-col{
    margin: 0;
    padding: 0;
}
a.nav{
    margin: 0;
    margin-right: 11%;
    margin-bottom: 38px;
    float: left;
    color: white;
    font-size: 14px;
    font-weight: 200;
    letter-spacing: 0.05em;
    text-transform: uppercase;
    text-decoration: underline;
    text-decoration-thickness: .5px;
} 
h1{
    font-size: 36px;
    font-weight: bold;
    text-transform: uppercase;
}
#header_contacts1{
    color: white;
    font-size: 14px;
    font-weight: 300;
    letter-spacing: 0.1em;
    text-transform: uppercase;
}
#header_contacts2{
    margin-bottom: 10px;
    color: white;
    font-size: 14px;
    font-weight: 300;
    letter-spacing: 0.1em;
    text-transform: uppercase;
}
.header_button{
    color: white;
    font-size: 14px;
    font-weight: bold;
    text-transform: uppercase;
    background-color: #f9283b;
    width: 135px;
    height: 42px;
    border-radius: 30px;
}
</style>
