package P1;

import org.springframework.beans.BeanUtils;
import org.springframework.util.ReflectionUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args)  {

        Class<?> furniture = Furniture.class;
        Class<?> price = Price.class;
        Class<?> table = Table.class;
        Class<?> chair = Chair.class;

        System.out.println(getPercentage(furniture));
        System.out.println(getPercentage(price));
        System.out.println(getPercentage(table));
        System.out.println(getPercentage(chair));


    }


        public static double getPercentage (Class<?> classType){
            int simpleProp = 0;
            PropertyDescriptor pro[] = BeanUtils.getPropertyDescriptors(classType);
            for (int i = 0; i < pro.length; i++) {
               if( BeanUtils.isSimpleProperty(pro[i].getPropertyType())){
                   simpleProp++;
               }

            }
            return (simpleProp*100)/pro.length;


        }


    }

