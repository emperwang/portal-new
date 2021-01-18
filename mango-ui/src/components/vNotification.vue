<template>
    <div>
        <el-button plain @click="open1">自动关闭</el-button>
        <el-button plain @click="open2">不会自动关闭</el-button>

        <el-button plain @click="open3">成功</el-button>
        <el-button plain @click="open4">警告</el-button>
    </div>    
</template>

<script>
export default {
    name:'vnotification',
    data(){
        return {

        }
    },
    methods: {
        open1(){
            const h = this.$createElement;
            this.$notify({
                title:'标题名称',
                message:h('i', {style:'color:teal'},
                '这是提示文案')
            });
        },
        open2(){
            this.$notify({
                title:'提示',
                message:'这是一条不会自动关闭的消息',
                duration: 0
            })
        },
        open3(){
            this.$notify({
                title:'成功',
                message:'这是一条成功的提示信息',
                type:'success'
            });
        },
        open4(){
            this.$notify({
                title:'警告',
                message:'这是一条警告的提示信息',
                type:'warning'
            })
        }
    }
}
</script>

<style lang="scss" scoped>

</style>
