
public class Customer {
int id;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + "]";
}
@Override
public int hashCode() {
	return this.id;
}
@Override
public boolean equals(Object o) {
	Customer cc=(Customer)o;
	return this.id==cc.id;
}

}
