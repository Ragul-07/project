package com.example.demo.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodDetails {
@Id
private int TableId;
private int Seats;
private String FoodName;
private String Feeback;
public int getTableId() {
	return TableId;
}
public void setTableId(int tableId) {
	TableId = tableId;
}
public int getSeats() {
	return Seats;
}
public void setSeats(int seats) {
	Seats = seats;
}
public String getFoodName() {
	return FoodName;
}
public void setFoodName(String foodName) {
	FoodName = foodName;
}
public String getFeeback() {
	return Feeback;
}
@Override
public String toString() {
	return "FoodDetails [TableId=" + TableId + ", Seats=" + Seats + ", FoodName=" + FoodName + ", Feeback=" + Feeback
			+ "]";
}
public void setFeeback(String feeback) {
	Feeback = feeback;
}
}