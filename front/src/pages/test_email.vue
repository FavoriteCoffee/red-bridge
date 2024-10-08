<template>
    <script src="https://smtpjs.com/v3/smtp.js"> </script>
    <input type="button" value="Send Email" onclick="sendEmail()">
</template>

<script setup>
    const sendEmail = () => {
        sendEmail.send({
            Host: '',
            Usernsme: '',
            Password: '',
            To:  '',
            From: '',
            Subject: '',
            Body: '',
        }).then(
            message => alert(message)
        )
    };
</script>
