package com.foodPlaza.Test;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
import com.foodPlaza.Dao.FoodDaoImpl;
import com.foodPlaza.Pojo.Feedback;
import com.foodPlaza.Pojo.Food;



public class FoodTest {
public static void main(String args[])
{
	FoodDaoImpl fdao=new FoodDaoImpl();
	Food f=new Food();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the choice");
	System.out.println("1.add FoodName");
	System.out.println("2.Delete Food");
	System.out.println("3.Update ");
	System.out.println("4.showAll food");
	System.out.println("5.Search By id");
	System.out.println("6.Search by Name");
	System.out.println("7.search food by catagory");
	//System.out.println("7.Search by Image");
	System.out.println("8.FeedBack");
	System.out.println("9.showAllFeedback");
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1: System.out.println("enter the name of food");
			String name=sc.next();
			System.out.println("enter the food type");
			String type=sc.next();
			System.out.println("enter food catagory");
			String catagory=sc.next();
			System.out.println("enter food descriptoin");
			String description=sc.next();
			
			System.out.println("enter food price");
			double price=sc.nextDouble();
			System.out.println("enter food image");
			String image=sc.next();
			
			Food f1=new Food(name,type,catagory,description,price,image);
						boolean b=fdao.addFood(f1);
			if(b)
			{
				System.out.println("food added succesfully");
			}
			else
			{
				System.out.println("food not insert");
			}
			break;
	case 2: 
		System.out.println("enter foodId you want to delet");
		int FoodId=sc.nextInt();
		boolean b1=fdao.deleteFood(FoodId);
		if(b1)
		{System.out.println("delete succesfyly");
		}
		else
		{
			System.out.println("not deleted");
		}
		
		break;
case 3: System.out.println("enter existing id for update");
			int id=sc.nextInt();
				System.out.println("enter the name of food");
			 name=sc.next();
			System.out.println("enter the food type");
			 type=sc.next();
			System.out.println("enter food catagory");
			 catagory=sc.next();
			System.out.println("enter food descriptoin");
			 description=sc.next();
			System.out.println("enter food price");
			 price=sc.nextDouble();
			System.out.println("enter food image");
			 image=sc.next();
			 
			f.setFoodId(id);
			f.setFoodName(name);
			f.setFoodType(type);
			f.setFoodCatagory(catagory);
			f.setFoodDesc(description);
			f.setFoodPrice(price);
			f.setImage(image);	
			//FoodDaoImpl fdao=new FoodDaoImpl();
			b=fdao.updateFood(f);
			if(b)
			{
				System.out.println("update");
			}
			else
			{	System.out.println("not update");
			}
				break;
			case 4:
				List<Food> l=fdao.getAllFood();
				if(l!=null) {
				Iterator<Food> it=l.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				}
				
			case 5:System.out.println("enter exitsting id");
			id=sc.nextInt();
			Food f3=fdao.searchFood(id);
			if(f3!=null)
			{
				System.out.println(f3);
			}
			else
			{
				System.out.println("food is not availble");
			}
			break;
			case 6:
				System.out.println("search food by name");
				name=sc.next();
				List<Food> li=fdao.searchFoodByName( name);
				if(li!=null)
					
				{Iterator<Food>it=li.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				}
				else
				{
					System.out.println("unsuccesfuly");
				}
				break;
				
			case 7:
				System.out.println("enter catagory");
				catagory=sc.next();
				List<Food>li1 =fdao.seatchFoodByCategory(catagory);
				if(li1!=null)
				{
					Iterator<Food>it=li1.iterator();
					while(it.hasNext())
					{
					System.out.println(it.next());
				}}
				else
				{
					System.out.print("unsucful");
				}
				break;
			case 8:
				System.out.println("Enter custName:");
				String custName = sc.next();
				System.out.println("Enter EmailId:");
				String emailId=sc.next();
				System.out.println("Enter review:");
				String review=sc.next();
				
			Feedback foodback=new Feedback(custName,emailId,review);
			boolean b2=fdao.addFeedback(foodback);
				
				
	if(b2)
	{
		System.out.println("feedback added succesfully");
	}
	else
	{
		System.out.println("feedback not insert");
	}
	break;
			case 9:
				List<Feedback> lf=fdao.getAllFeedback();
				if(lf!=null) {
				Iterator<Feedback> it=lf.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				}
				
		break;
			default :
				System.out.println("invalid impurt");
	}
			
	
}
}
