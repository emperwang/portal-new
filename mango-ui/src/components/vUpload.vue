<template>
    <div>
        <el-row>
            <el-col :span="6">
            <el-upload
                action="http://jsonplaceholder.typicode.com/posts/"
                :on-preview='handlePreview'
                :on-remove='handleRemove'
                :before-remove="beforeRemove"
                multiple
                :limit="3"
                :on-exceed="handleExceed"
                :file-list="fileList"
            >
            <el-button size="small" type="primaey">点击上传</el-button>
            <div slot="tip" class="el-upload__tip">只能上传jpg/jpep文件,不超过500k</div>
            </el-upload>
            </el-col>

            <el-col :span="6">
                <el-upload
                ref="upload"
                action="http://jsonplaceholder.typicode.com/posts/"
                :on-preview="handlePreview"
                :on-remove="handleRemove"
                :file-list="fileList"
                :auto-upload="false"
                >
                <el-button slot="trigger" size="small" type="primary">选举文件</el-button>
                <el-button size="small" type="success" @click="submitUpload">上传到服务器</el-button>
                <div slot="tip" class="tip">只能上传jpg/jpep文件</div>
                </el-upload>
            </el-col>

            <el-col :span="6">
                <el-upload
                drag action="http://jsonplaceholder.typicode.com/posts/"
                multiple
                >
                <i class="el-icon-upload"></i>
                <div class="el-upload__text">将文件拖到此处或<em>点击上传</em></div>
                <div class="tip">只能上传jpg文件</div>
                </el-upload>
            </el-col>
        </el-row>

        <el-row>
            <el-col :span="6">
                <el-upload
                action="#"
                list-type="picture-card"
                :auto-upload="false">
                <i slot="default" class="el-icon-plus"></i>
                <div slot="file" slot-scope="{file}">
                    <img class="el-upload-list__item-thumbnail" :src="file.url" alt="">
                <span class="el-upload-list__item-actions">
                    <span class="el-upload-list__item-preview" @click="handlePictureCardPreviuew(file)">
                        <i class="el-icon-zoom-in"></i>
                    </span>
                    <span v-if="!disabled" class="el-upload-list__item-delete" @click="handleDownload(file)">
                        <i class="el-icon-download"></i>
                    </span>
                    <span v-if="!disabled" class="el-upload-list__item-delete" @click="handleRemove11(file)">
                        <i class="el-icon-delete"></i>
                    </span>
                </span>
                </div>
                </el-upload>

                <el-dialog :visible.sync="dialogVisible">
                    <img  width="100%" :src="dialogImageUrl" alt="">
                </el-dialog>
            </el-col>
        </el-row>
    </div>
</template>

<script>
export default {
    name: 'vupload',
    data(){
        return {
            fileList:[],
            dialogImageUrl: '',
            dialogVisible: false,
            disabled: false
        }
    },
    methods: {
        handlePreview(file){
            console.log("handlePreview")
            console.log(file,this.fileList)
        },
        handleRemove(file, fileList){
            console.log("handleRemove...")
            console.log(file)
            console.log(fileList)
        },
        beforeRemove(file,fileList){
            console.log("before remove")
            console.log(file)
            console.log(fileList)
        },
        handleExceed(file,fileList){
            console.log("handleExceed")
            console.log(file)
            console.log(fileList)
        },
        submitUpload(){
            this.$refs.upload.submit();
        },
        handlePictureCardPreviuew(file){
            this.dialogImageUrl = file.url;
            this.dialogVisible = true
        },
        handleDownload(file){
            console.log(file)
        },
        handleRemove11(file){
            console.log("handleRemove11...")
            console.log(file)
        },
    }
}
</script>

<style lang="scss" scoped>
.tip {
    font-size: 12px;
    color: #606266;
    margin-top: 7px;
}
</style>

