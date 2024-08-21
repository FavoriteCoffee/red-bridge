<template>
    <Header></Header>
    <newheader></newheader>
    <v-row>
        
    </v-row>    
    <v-row>
        <Top_nav></Top_nav>
    </v-row>
    <v-row>
        <div id="main_content">
            <div id="content">
                <p>11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                    11111111111111111111111111111111111111111111111111
                </p>
            </div>
            <div id="form">
                <FeedbackForm></FeedbackForm>
            </div>
        </div>
        
    </v-row>
    <v-row>
        <Footer></Footer>
    </v-row>

    <!-- TODO
    задать макс ширину мэйну
    сделать исчезание элементов при сужении экрана
    задать классы колонкам квадратиков -->
</template>

<script setup>
    import Header from "../components/Header.vue"
    import Top_nav from "../components/Top-nav.vue"
    import Footer from "../components/Footer.vue"
    import FeedbackForm from "../components/FeedbackForm.vue"
    import newheader from "../components/newheader.vue"
</script>

<style>
#main_content{
    margin: 0 auto;
    max-width: 900px;
}

#content{
    float: left;
    width: 700px;
   
    margin-top: 20px;
}

p{
    margin: 0;
    padding: 0;
}

.v-row{
    width: 100%;
}

#form{
    float: right;
}
</style>