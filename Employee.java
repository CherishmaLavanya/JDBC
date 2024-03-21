package Lavanya_jdbc_program1;
    
public class Employee {

		private int id;
		private String name;
		private int depid;

		public String getname() {
			return name;

		}

		public void setname(String name) {
			this.name = name;

		}

		public void setid(int id) {
			this.id = id;

		}

		public int getid() {
			return id;

		}

		public int getDepid() {
			return depid;
		}

		public void setDepid(int depid) {
			this.depid = depid;
		}
		Employee(int id,String name,int depid){
			this.id=id;
			this.name=name;
			this.depid=depid;
		}

	}

