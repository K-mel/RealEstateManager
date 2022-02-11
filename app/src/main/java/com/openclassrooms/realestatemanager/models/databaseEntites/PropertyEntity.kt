package com.openclassrooms.realestatemanager.models.databaseEntites

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.openclassrooms.realestatemanager.models.enums.PropertyType
import com.openclassrooms.realestatemanager.models.enums.DataState

@Entity(tableName = "properties")
data class PropertyEntity(
    @PrimaryKey
    val propertyId: String,
    var type: PropertyType,
    var price: Double?,
    var surface: Double?,
    var roomsAmount: Int?,
    var bathroomsAmount: Int?,
    var bedroomsAmount: Int?,
    var description: String,
    var addressLine1: String,
    var addressLine2: String,
    var city: String,
    var postalCode: String,
    var country: String,
    var latitude: Double?,
    var longitude: Double?,
    var mapPictureUrl: String?,
    var postDate: Long,
    var soldDate: Long?,
    var agentName: String,
    var dataState: DataState
)