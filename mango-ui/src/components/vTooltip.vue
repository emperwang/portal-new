<template>
    <div class="box">
        <div class="top">
            <el-tooltip class="item" effect="dark"
                content="Top Left提示文字"
                placement="top-start"
            >
                <el-button>上左</el-button>
            </el-tooltip>
            <el-tooltip class="item" effect="dark"
                content="Top Center提示文字"
                placement="top"
            >
                <el-button>上左</el-button>
            </el-tooltip>
            <el-tooltip class="item" effect="dark" 
            content="Top Rght提示文字"
            placement="top-end"
            >
                <el-button>上右</el-button>
            </el-tooltip>
        </div>
    </div>
</template>

<script>
export default {
    name: 'vtooltip',
    data(){
        return {

        }
    }, 
    methods:{
        
    }
}
</script>

<style lang="scss" scoped>
.box {
    width: 400px;

    .top {
        text-align: center;
    }
    .left {
        float: left;
        width: 60px;
    }
    .right {
        float: right;
        width: 60px;
    }
    .bottom{
        clear: both;
        text-align: center;
    }
    .item {
        margin: 4px;
    }
}
</style>