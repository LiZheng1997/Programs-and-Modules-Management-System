(window.webpackJsonp=window.webpackJsonp||[]).push([["chunk-a170"],{V4BT:function(t,e,r){},XVVT:function(t,e,r){"use strict";var o=r("V4BT");r.n(o).a},"Yx+j":function(t,e,r){"use strict";r.r(e);var o=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{staticClass:"app-container"},[r("el-steps",{staticStyle:{"margin-top":"20px"},attrs:{active:t.active,"finish-status":"success",simple:""}},[r("el-step",{attrs:{title:"Part A"}}),t._v(" "),r("el-step",{attrs:{title:"Part B"}}),t._v(" "),r("el-step",{attrs:{title:"Part C"}}),t._v(" "),r("el-step",{attrs:{title:"Review"}})],1),t._v(" "),r("keep-alive",[0==t.active?r("A"):t._e(),t._v(" "),1==t.active?r("B"):t._e(),t._v(" "),2==t.active?r("C"):t._e(),t._v(" "),3==t.active?r("review"):t._e()],1),t._v(" "),r("el-button-group",[r("el-button",{attrs:{type:"danger",icon:"el-icon-edit"},on:{click:t.onCancel}},[t._v("Cancel")]),t._v(" "),r("el-button",{attrs:{type:"success",icon:"el-icon-share"},on:{click:function(e){t.submitForm(t.active)}}},[t._v("Save")])],1),t._v(" "),r("el-button-group",[r("el-button",{attrs:{type:"primary",icon:"el-icon-arrow-left"},on:{click:function(e){t.onPrev()}}},[t._v("Back")]),t._v(" "),r("el-button",{attrs:{type:"primary"},on:{click:function(e){t.onNext()}}},[t._v("Next"),r("i",{staticClass:"el-icon-arrow-right el-icon--right"})])],1)],1)};o._withStripped=!0;var a=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{staticClass:"app-container"},[r("h3",{staticStyle:{"border-left":"5px solid #409EFF","padding-left":"10px"}},[t._v("\n    Administrative Information\n  ")]),t._v(" "),r("el-card",{staticClass:"box-card",attrs:{shadow:"never"}},[r("el-form",{ref:"form_A",attrs:{inline:!1,model:t.form_A,"label-position":"right"}},[r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:8}},[r("el-form-item",{attrs:{label:"Module Code","label-width":"110px",prop:"code"}},[r("el-input",{model:{value:t.form_A.code,callback:function(e){t.$set(t.form_A,"code",e)},expression:"form_A.code"}})],1)],1),t._v(" "),r("el-col",{attrs:{span:16}},[r("el-form-item",{attrs:{label:"Module Title","label-width":"110px",prop:"title"}},[r("el-input",{model:{value:t.form_A.title,callback:function(e){t.$set(t.form_A,"title",e)},expression:"form_A.title"}})],1)],1)],1),t._v(" "),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:8}},[r("el-form-item",{attrs:{label:"Module Co-ordinator","label-width":"160px",prop:"co_ordinator"}},[r("el-input",{model:{value:t.form_A.co_ordinator,callback:function(e){t.$set(t.form_A,"co_ordinator",e)},expression:"form_A.co_ordinator"}})],1)],1),t._v(" "),r("el-col",{attrs:{span:16}},[r("el-form-item",{attrs:{label:"Proposer or other contact for approval purposes if different to above","label-width":"470px",prop:"other_co_ordinator"}},[r("el-input",{model:{value:t.form_A.other_co_ordinator,callback:function(e){t.$set(t.form_A,"other_co_ordinator",e)},expression:"form_A.other_co_ordinator"}})],1)],1)],1),t._v(" "),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("el-form-item",{attrs:{label:"Owning department","label-width":"150px",prop:"department"}},[r("el-input",{model:{value:t.form_A.department,callback:function(e){t.$set(t.form_A,"department",e)},expression:"form_A.department"}})],1)],1),t._v(" "),r("el-col",{attrs:{span:12}},[r("el-form-item",{attrs:{label:"Owning faculty","label-width":"140px",prop:"faculty"}},[r("el-input",{model:{value:t.form_A.faculty,callback:function(e){t.$set(t.form_A,"faculty",e)},expression:"form_A.faculty"}})],1)],1)],1)],1),t._v(" "),r("el-form",{ref:"form_A",attrs:{inline:!1,model:t.form_A,"label-position":"top"}},[r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:24}},[r("el-form-item",{attrs:{label:"Other contributing departments It is important that this has been agreed between all departments involved as these figures will have a direct impact on departmental income allocations.","label-width":"400px",prop:"other_department"}},[r("el-col",{attrs:{span:4}},[r("span",[t._v("Department  ")])]),t._v(" "),r("el-col",{attrs:{span:8}},[r("el-input",{model:{value:t.form_A.department,callback:function(e){t.$set(t.form_A,"department",e)},expression:"form_A.department"}})],1),t._v(" "),r("el-col",{attrs:{span:4}},[r("span",[t._v("%split  ")])]),t._v(" "),r("el-col",{attrs:{span:8}},[r("el-input",{model:{value:t.form_A.department,callback:function(e){t.$set(t.form_A,"department",e)},expression:"form_A.department"}})],1)],1)],1)],1),t._v(" "),r("el-row",{attrs:{gutter:20}},[r("el-form-item",{attrs:{prop:"temp"}},[r("el-input",{attrs:{type:"textarea",autosize:"",placeholder:"Please Enter the Content"},model:{value:t.form_A.temp,callback:function(e){t.$set(t.form_A,"temp",e)},expression:"form_A.temp"}})],1)],1)],1)],1)],1)};a._withStripped=!0;var l={data:function(){return{form_A:{temp:"",code:"",title:"",co_ordinator:"",other_co_ordinator:"",department:"",faculty:""}}},methods:{}},n=r("KHd+"),i=Object(n.a)(l,a,[],!1,null,null,null);i.options.__file="src/views/module/create/A.vue";var s=i.exports,c=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{staticClass:"app-container"},[r("h3",{staticStyle:{"border-left":"5px solid #409EFF","padding-left":"10px"}},[t._v("\n    HEAR Programme Description\n  ")]),t._v(" "),r("el-card",{staticClass:"box-card",attrs:{shadow:"never"}},[r("div",{staticStyle:{padding:"30px"}},[r("el-form",{ref:"form_B",attrs:{model:t.form_B,"label-position":"right"}},[r("el-row",{attrs:{gutter:20}},[r("el-form-item",{attrs:{prop:"temp"}},[r("el-input",{attrs:{type:"textarea",autosize:"",placeholder:"Please Enter the Content"},model:{value:t.form_B.temp,callback:function(e){t.$set(t.form_B,"temp",e)},expression:"form_B.temp"}})],1)],1)],1)],1)])],1)};c._withStripped=!0;var p={data:function(){return{form_B:{temp:""}}},methods:{}},m=Object(n.a)(p,c,[],!1,null,null,null);m.options.__file="src/views/module/create/B.vue";var u=m.exports,d=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{staticClass:"app-container"},[r("h3",{staticStyle:{"border-left":"5px solid #409EFF","padding-left":"10px"}},[t._v("\n    HEAR Programme Description\n  ")]),t._v(" "),r("el-card",{staticClass:"box-card",attrs:{shadow:"never"}},[r("div",{staticStyle:{padding:"30px"}},[r("el-form",{ref:"form_C",attrs:{model:t.form_C,"label-position":"right"}},[r("el-row",{attrs:{gutter:20}},[r("el-form-item",{attrs:{prop:"temp"}},[r("el-input",{attrs:{type:"textarea",autosize:"",placeholder:"Please Enter the Content"},model:{value:t.form_C.temp,callback:function(e){t.$set(t.form_C,"temp",e)},expression:"form_C.temp"}})],1)],1)],1)],1)])],1)};d._withStripped=!0;var f={data:function(){return{form_C:{temp:""}}},methods:{}},_=Object(n.a)(f,d,[],!1,null,null,null);_.options.__file="src/views/module/create/C.vue";var v=_.exports,h=function(){var t=this.$createElement;return(this._self._c||t)("div",[this._v("\n  This is Review Step.\n")])};h._withStripped=!0;var b={data:function(){return{}}},w=Object(n.a)(b,h,[],!1,null,null,null);w.options.__file="src/views/module/create/review.vue";var x={name:"Index",components:{A:s,B:u,C:v,review:w.exports},data:function(){return{form:{name:"",region:"",date1:"",date2:"",delivery:!1,type:[],resource:"",desc:""},active:0,formName:""}},methods:{onSave:function(){this.$message("submit!")},onCancel:function(){this.$message({message:"cancel!",type:"warning"})},onPrev:function(){this.$message("Prev!"),--this.active,this.active<0&&(this.active=0)},onNext:function(){this.$message("Next!"),this.active++>6&&(this.active=0)},submitForm:function(t){this.getFormName(t),this.$refs[this.formName].validate(function(t){if(!t)return console.log("error submit!!"),!1;alert("submit!")})}}},A=(r("XVVT"),Object(n.a)(x,o,[],!1,null,"d90164d0",null));A.options.__file="src/views/module/create/index.vue";e.default=A.exports}}]);