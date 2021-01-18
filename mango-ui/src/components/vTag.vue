<template>
    <div>
        <el-row :gutter="20">
            <el-col :span="2">
                <el-tag>标签一</el-tag>
            </el-col>
            <el-col :span="2">
                <el-tag type="success">标签二</el-tag>
            </el-col>
            <el-col :span="2">
                <el-tag type="info" closable>标签三</el-tag>
            </el-col>
            <el-col :span="2">
                <el-tag type="warning">标签四</el-tag>
            </el-col>
            <el-col :span="2">
                <el-tag type="danger">标签五</el-tag>
            </el-col>
        </el-row>
        <el-row>
            <el-tag :key='tag' v-for="tag in dynamicTags"
                closable
                :disable-transitions="false"
                @close="handleClose(tag)"
            >{{tag}}</el-tag>
            <el-input
            class="input-new-tag"
            v-if="inputVisible"
            v-model="inputValue"
            ref="saveTagInput"
            size="small"
            @keyup.enter.native="handleInputConfirm"
            @blur="handleInputConfirm"
            ></el-input>
            <el-button v-else class="button-new-tag" size="small"
                @click="showInput">+New Tag
            </el-button>
        </el-row>
    </div>
</template>
<script>
export default {
    name: 'vtag',
    data(){
        return{
            dynamicTags:['标签1','标签2','标签3'],
            inputVisible: false,
            inputValue:''
        }
    },
    methods: {
        handleClose(tag){
            this.dynamicTags.splice(this.dynamicTags.indexOf(tag),1);
        },
        showInput(){
            this.inputVisible = true;
            this.$nextTick(_=>{
                this.$refs.saveTagInput.$refs.input.focus();
            })
        },
        handleInputConfirm(){
            let inputValue = this.inputValue;
            if(inputValue) {
                this.dynamicTags.push(inputValue);
            }
            this.inputVisible = false;
            this.inputValue = '';
        }
    }
}
</script>
<style lang="scss" scoped>
.el-tag + .el-tag {
    margin-left: 10px;
}
.input-new-tag{
    width: 90px;
    margin-left: 10px;
    vertical-align: bottom;
}
.button-new-tag{
    margin-left: 10px;
    height: 32px;
    line-height: 30px;
    padding-top: 0;
    padding-bottom: 0;
}
</style>
