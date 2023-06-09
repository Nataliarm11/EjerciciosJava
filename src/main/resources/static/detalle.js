const {createApp} = Vue;

const app = createApp ({

    data(){
        return {
            mentores:[],


        }
    },

    created(){
        this.mentoresMindHub();


    },

    methods:{
        mentoresMindHub(){
            axios.get('/api/mentors/')
            .then ( response => {
                this.mentores = response.data;
                console.log(this.mentores)






            })
            .catch(error => console.log(error));

        }


    }






})
app.mount('#app');