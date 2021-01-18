<template>
    <div>
        <div>
            <el-page-header @back="goback" content="详情页面"></el-page-header>
        </div>
    </div>
</template>
<script>
export default {
    name:'pageheader',
    data(){
        return {

        }
    },
    methods: {
        goback(){
            console.log('go back');
            this.$router.push('/');
        }
    }
}
</script>

<style lang="scss" scoped>

</style>
