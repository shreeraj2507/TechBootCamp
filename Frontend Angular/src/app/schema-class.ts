export class SchemaClass {
    name:String="";
    email:String="";
    mobileno:number=0;

    constructor(mobile_no:number , email_id:String , name:String){
        this.mobileno=mobile_no;
        this.email=email_id;
        this.name=name
    }
}
