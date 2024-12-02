package com.example.doga_15_10_24

import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    data class Customer(
        val customerId: String,
        val name: String,
        val email: String,
        val phone: String
        )

    data class OrderItems(
        val itemId: String,
        val productName: String,
        val quantity: Int,
        val pricePerUnit: Double,
        val discount: Double?
    )

    data class Shipping(
        val address: Address,
        val shippingMethod: String,
        val estimatedDeliveryDays: Int
    )

    data class Address(
        val street: String,
        val city: String,
        val postalCode: Int,
        val country: String
    )

    data class Payment(
        val paymentMethod: String,
        val totalAmount: Double,
        val paid: Boolean
    )

    data class Order(
        val orderId: String,
        val customer:Customer,
        val orderItems: ArrayList<OrderItems>,
        val shipping: Shipping,
        val payment: Payment,
        val status: String)



    private lateinit var openCalculatorButton: Button
    private lateinit var openGreetingButton: Button
    private lateinit var openMenuButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
 //       ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
 //           val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
 //           v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
 //           insets
 //       }

        openCalculatorButton = findViewById(R.id.openCalculatorButton)
        openGreetingButton = findViewById(R.id.openGreetingButton)
        openMenuButton = findViewById(R.id.openMenuButton)


        openCalculatorButton.setOnClickListener{
            
        }


        data class University(
            val universityName: String,
            val departments: List<Department>
        )

        data class Department(
            val name: String,
            val professors: List<Professor>,
            val students: List<Student>
        )

        data class Professor(
            val name: String,
            val subject: String
        )

        data class Student(
            val name: String,
            val studentId: String,
            val courses: List<Course>
        )

        data class Course(
            val courseName: String,
            val credits: Int
        )

        data class Airport(
            val airportName: String,
            val terminals: List<Terminal>
        )

        data class Terminal(
            val terminalName: String,
            val flights: List<Flight>
        )

        data class Flight(
            val flightNumber: String,
            val destination: String,
            val airline: Airline
        )

        data class Airline(
            val name: String,
            val country: String
        )

        data class Publisher(
            val publisherName: String,
            val authors: List<Author>
        )

        data class Author(
            val authorName: String,
            val books: List<Book>
        )

        data class Book(
            val title: String,
            val year: Int,
            val ratings: List<Rating>? = null
        )

        data class Rating(
            val rating: Int,
            val comment: String
        )

        data class Agency(
            val agencyName: String,
            val customers: List<Customer>
        )

        data class Customer(
            val customerId: String,
            val name: String,
            val email: String,
            val bookings: List<Booking>
        )

        data class Booking(
            val bookingId: String,
            val package: Package,
            val rating: Rating? = null
        )

        data class Package(
            val packageId: String,
            val destination: String,
            val durationDays: Int,
            val price: Int,
            val activities: List<Activity>
        )

        data class Activity(
            val activityName: String,
            val type: String
        )


    }
}