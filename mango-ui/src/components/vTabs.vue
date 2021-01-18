<template>
    <div>
        <div>
            <el-tabs v-model="activeName" @tab-click="handleClick">
                <el-tab-pane label="用户管理" name="first">
                    <el-button type="primary">panel-content</el-button>
                </el-tab-pane>

                <el-tab-pane label="配置管理" name="second">
                    <el-button type="warning">配置content</el-button>
                </el-tab-pane>

                <el-tab-pane label="角色管理" name="third">
                    <el-button type="danger">角色content</el-button>
                </el-tab-pane>

                <el-tab-pane label="定时任务补偿" name="fourth">
                    定时任务 content
                </el-tab-pane>
            </el-tabs>
        </div>
        <div class="top">
            <el-tabs type="card" v-model="activeName" @tab-click="handleClick">
                <el-tab-pane label="用户管理" name="first">
                    <el-button type="primary">panel-content</el-button>
                </el-tab-pane>

                <el-tab-pane label="配置管理" name="second">
                    <el-button type="warning">配置content</el-button>
                </el-tab-pane>

                <el-tab-pane label="角色管理" name="third">
                    <el-button type="danger">角色content</el-button>
                </el-tab-pane>

                <el-tab-pane label="定时任务补偿" name="fourth">
                    定时任务 content
                </el-tab-pane>
            </el-tabs>
        </div>

        <div class="top">
           <el-tabs type="border-card" v-model="activeName" @tab-click="handleClick">
                <el-tab-pane label="用户管理" name="first">
                    <el-button type="primary">panel-content</el-button>
                </el-tab-pane>

                <el-tab-pane label="配置管理" name="second">
                    <el-button type="warning">配置content</el-button>
                </el-tab-pane>

                <el-tab-pane label="角色管理" name="third">
                    <el-button type="danger">角色content</el-button>
                </el-tab-pane>

                <el-tab-pane label="定时任务补偿" name="fourth">
                    定时任务 content
                </el-tab-pane>
            </el-tabs> 
        </div>

        <div class="top">
            <el-radio-group v-model="tabPosition">
                <el-radio-button label="top">top</el-radio-button>
                <el-radio-button label="right">right</el-radio-button>
                <el-radio-button label="bottom">bottom</el-radio-button>
                <el-radio-button label="left">left</el-radio-button>
            </el-radio-group>
            <div style="margin-top: 30px">
            <el-tabs :tab-position="tabPosition">
                <el-tab-pane>
                    <span slot="label"><i class="el-icon-date"></i>用户管理</span>
                </el-tab-pane>
                <el-tab-pane label="配置管理">配置-content</el-tab-pane>
                <el-tab-pane label="角色管理">角色-content</el-tab-pane>
                <el-tab-pane label="定时任务补偿">定时任务-content</el-tab-pane>
            </el-tabs>
            </div>
        </div>

        <div class="top">
            <el-tabs v-model="editableTabsValue" type="card" editable @edit="handleTabEdits">
                <el-tab-pane v-for="(item,index) in editableTabs"
                    :key="index"
                    :label="item.title"
                    :name="item.name"
                >{{item.content}}</el-tab-pane>
            </el-tabs>
        </div>
    </div>
</template>
<script>
export default {
    name:'vtab',
    data(){
        return{
            activeName:'second',
            tabPosition:'left',
            editableTabsValue:'2',
            editableTabs: [{
                title:'Tab1',
                name:'1',
                content:'tab 1 content'
            },{
                title:'Tab2',
                name:'2',
                content:'tab2 content'
            }],
            tabIndex: 2
        }
    },
    methods:{
        handleClick(tab, event){
                console.log(tab);
                console.log(event);
        },
        handleTabEdits(targetName, action){
            if(action === 'add'){
                let newTabName = ++this.tabIndex+'';
                this.editableTabs.push({
                    title:'New Tab',
                    name: newTabName,
                    content:'New  Tab content'
                });
                this.editableTabsValue = newTabName;
            }
            if(action === 'remove') {
                let tabs = this.editableTabs;
                let activeName = this.editableTabsValue;
                if(activeName === targetName){
                    tabs.forEach((tab,index) => {
                        if(tab.name === targetName){
                            let nextTab = tabs[index + 1] || tabs[index - 1];
                            if(nextTab) {
                                activeName = nextTab.name;
                            }
                        }
                    });
                }
                this.editableTabsValue = activeName;
                this.editableTabs = tabs.filter(tab => tab.name !== targetName);
            }
        }
    }
}
</script>

<style lang="scss" scoped>
.top {
    margin-top: 50px;
}
</style>
