<template>
    <v-row>
        <Header></Header>
    </v-row>    
    <v-row>
        <Top_nav></Top_nav>
    </v-row>
    <v-row>
        <FeedbackForm></FeedbackForm>
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
</script>