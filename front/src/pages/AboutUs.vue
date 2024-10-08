<template>
    <v-row>
        <Header></Header>
    </v-row>
    <v-row>
        <TopNav></TopNav>
    </v-row>
    <v-row>
        <div class="content">
            <div class="main-content">
                <h2>Красный мост - Россия-Китай</h2>
            </div>
            <FeedbackForm></FeedbackForm>
        </div>
    </v-row>
    <v-row>
        <Footer></Footer>
    </v-row>

</template>
<script setup>
    import Header from '@/components/Header.vue';
    import Footer from '@/components/Footer.vue';
    import FeedbackForm from '@/components/FeedbackForm.vue';
    import TopNav from '@/components/Top-nav.vue';
</script>