package com.openclassrooms.realestatemanager.utils

import com.openclassrooms.realestatemanager.models.MediaItem
import com.openclassrooms.realestatemanager.models.Property
import com.openclassrooms.realestatemanager.models.enums.FileType
import com.openclassrooms.realestatemanager.models.enums.PointOfInterest
import com.openclassrooms.realestatemanager.models.enums.PropertyType
import java.util.*

fun generateOfflineProperties() : List<Property> {
    return listOf(
        Property(
            id = "1",
            type = PropertyType.FLAT,
            price = 169000.0,
            surface = 900.0,
            roomsAmount = 8,
            bathroomsAmount = 1,
            bedroomsAmount = 3,
            description = "Peaceful and quiet, this approximately 900sf home has much to offer.  Spacious one bedroom with a separate " +
                    "dining alcove and a huge bedroom measuring 12x18'3. The full, windowed kitchen is original, just waiting for your " +
                    "creative touch.  This wonderful apartment has lots of storage with 3 large closets.  There are lovely, solid oak " +
                    "parquet flooring throughout.  Carnegie House is situated in the heart of midtown, steps to Central Park, Carnegie " +
                    "Hall, Lincoln Center, the Theater District and the Time Warner Center. The full service building is pet-friendly, " +
                    "has a Concierge, valet, bike room, storage, and an on-site garage in which residents receive a 25% discount. " +
                    "Pied-a-terre, parent's buying for children, and co-purchasing are allowed.  There is a monthly special assessment " +
                    "of $287.24 through 2/28/22 not included in the maintenance",
            mediaList = listOf(
                MediaItem("128af304-86e1-4796-a814-392ffc461ee7", "1", "https://photos.zillowstatic.com/fp/5f3b6091f47a36edac88ad461d7b5518-cc_ft_576.jpg", "Living room", FileType.PICTURE),
                MediaItem("2e0805f7-1fe8-4392-9952-00e8ecb75d58", "1", "https://photos.zillowstatic.com/fp/a1ac5668a4dcc1795e250b8f2779633f-o_a.jpg", "Bedroom", FileType.PICTURE)
            ),
            addressLine1 = "45 Rockefeller Plaza",
            city = "Manhattan",
            postalCode = "NY 10111",
            country = "USA",
            latitude = 40.7589408497391,
            longitude = -73.97983110154246,
            pointOfInterestList = listOf(PointOfInterest.SCHOOL, PointOfInterest.PARK),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 5, 20) }.timeInMillis,
            agentName = "John McLaughlin",
            mapPictureUrl = getStaticMapUrl(40.7589408497391, -73.97983110154246)
        ),
        Property(
            id = "2",
            type = PropertyType.FLAT,
            price = 379000.0,
            surface = 1800.0,
            roomsAmount = 8,
            bathroomsAmount = 2,
            bedroomsAmount = 2,
            description = "This is a magnificent opportunity to purchase an apartment that is requiring TLC. It is approximately 1800 " +
                    "square feet with fabulous Southeastern views overlooking the East River. One can also see full Central Park views " +
                    "as well as those of the George Washington Bridge.  The apartment contains two large Bedrooms and can even convert " +
                    "to three Bedrooms. It has 2.5 Bathrooms, a Dining Room, a windowed Kitchen and an immense central Foyer. Another " +
                    "extra special amenity is the Southern Terrace overlooking New York City's magnificent sites such as the Chrysler " +
                    "Building and the Freedom Tower. There is Central Air Conditioning, huge Closets and a spot for a Washer/Dryer. It " +
                    "is located on the 32nd floor in a luxury Building on Billionaire's row. The building contains a 20,000 sq ft Gym/Spa " +
                    "and a large indoor/outdoor salt water Pool. There is a 24 hour Garage as well a 24 hour service; consisting of concierges, " +
                    "doormen and repairmen. Pets, Pied-a-terres and sublets are allowed. A fabulous public school is located across the " +
                    "street, thus easing educational costs.",
            mediaList = listOf(
                MediaItem("112badc2-f930-414d-a3ec-2ec58fb6d512", "2", "https://photos.zillowstatic.com/fp/1e71b46abea77c70303f76af0886cc30-cc_ft_768.jpg", "Living room", FileType.PICTURE),
                MediaItem("2135e97e-fff5-4840-bb61-e7188ba37613", "2", "https://photos.zillowstatic.com/fp/d9fb3b499aee5de69f2c400c6f626d92-cc_ft_384.jpg", "Bedroom", FileType.PICTURE),
                MediaItem("26b4306a-7698-4e7e-93a1-ee5d4ade45c0", "2", "https://photos.zillowstatic.com/fp/0dfa3f33fa13c6a6b3bcbc55894de2ce-cc_ft_384.jpg", "View", FileType.PICTURE),
                MediaItem("2a5ab2dc-d789-4e4c-8f5e-2a29ef1b3200", "2", "https://photos.zillowstatic.com/fp/a60feda35e489359a1f46c34fbc31106-cc_ft_384.jpg", "Living room", FileType.PICTURE)
            ),
            addressLine1 = "303 E 57th St APT 32B",
            city = "Manhattan",
            postalCode = "NY 10022",
            country = "USA",
            latitude = 40.759524542858905,
            longitude = -73.9648487396234,
            pointOfInterestList = listOf(
                PointOfInterest.GROCERY,
                PointOfInterest.PARK,
                PointOfInterest.SWIMMING_POOL,
                PointOfInterest.PARKING,
                PointOfInterest.FITNESS_CLUB,
                PointOfInterest.PUBLIC_TRANSPORT,
                PointOfInterest.SCHOOL
            ),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 5, 18) }.timeInMillis,
            soldDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 8, 12) }.timeInMillis,
            agentName = "Kristen Fortino",
            mapPictureUrl = getStaticMapUrl(40.759524542858905, -73.9648487396234)
        ),
        Property(
            id = "3",
            type = PropertyType.HOUSE,
            price = 478500.0,
            surface = 1892.0,
            roomsAmount = 7,
            bathroomsAmount = 1,
            bedroomsAmount = 2,
            description = "Welcome to your fantasy home! Imagine owning this magical single family house and living out your dreams. " +
                    "With 3 spacious bedrooms, it’ll be like owning your own castle with plenty of space for your family and friends. " +
                    "The open kitchen layout and central air units would ensure that you, your family, and friends will always be " +
                    "comfortable as you wine and dine those happy nights away. You’ll be the subject of envy as your guests admire the " +
                    "gorgeous bamboo flooring running throughout the whole house. Not to mention, you’ll have enough bathrooms to accommodate " +
                    "your needs with 1 full bathroom on the 2nd floor and a half bathroom on the 1st floor. No longer would there be a " +
                    "need to call dibs on the bathroom in the morning! But what about parking? Fear not! There are 2 private parking spaces " +
                    "that may be used in whichever way you deem fit. If you're already imagining yourself living here, come join us to " +
                    "preview this beautiful home! Don’t let this fantastic dream pass you by!  This beautiful home is located close to " +
                    "Arden Height Woods Park where you can enjoy the fresh air and out door actives with Mother Nature. Close to school " +
                    "like P.S. 4 Maurice Wollin School and other great schools as well. Shopping areas and Restaurants are just minutes " +
                    "away. There is also a South Shore Golf Course near by for golf lover to hit some ball on a beautiful green grass. " +
                    "Did I mention there's 2 community olympic size pools? Travel is super convenient because the highway is just minutes " +
                    "away. Don’t let this fantastic dream home pass you by!",
            mediaList = listOf(
                MediaItem("64244c1d-03ce-4ae4-8c4c-00543593ca6e", "3", "https://photos.zillowstatic.com/fp/14f1984c6ec05fb7a4356e4133934aea-cc_ft_768.jpg" , "Dining room 1", FileType.PICTURE),
                MediaItem("122e9274-92b1-478d-94fc-539af0e67718", "3", "https://photos.zillowstatic.com/fp/75348e9428f0589a82cb70fe52df08bd-cc_ft_384.jpg" , "Living room", FileType.PICTURE),
                MediaItem("25ac66fc-2a4f-4e3e-8f68-9d9c14cff0d8", "3", "https://photos.zillowstatic.com/fp/d74ac5d7059bf5528659234054c21481-cc_ft_384.jpg" , "Kitchen", FileType.PICTURE),
                MediaItem("2ad5793d-f524-454a-8610-2a7465714f70", "3", "https://photos.zillowstatic.com/fp/d3e29b38f5c0a428df23d66d07cc16cd-cc_ft_384.jpg" , "Bathroom", FileType.PICTURE),
                MediaItem("105385eb-1f74-4d72-8c4b-b2dd254d5675", "3", "https://photos.zillowstatic.com/fp/d041509f327311831d711545a012c856-cc_ft_384.jpg" , "Dining room 2", FileType.PICTURE)
            ),
            addressLine1 = "32 Barclay Cir",
            city = "Staten Island",
            postalCode = "NY 10312",
            country = "USA",
            latitude = 40.553881452248525,
            longitude = -74.19466925910078,
            pointOfInterestList = listOf(
                PointOfInterest.SCHOOL,
                PointOfInterest.SWIMMING_POOL,
                PointOfInterest.PARKING,
                PointOfInterest.PUBLIC_TRANSPORT
            ),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 4, 28) }.timeInMillis,
            soldDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 8, 10) }.timeInMillis,
            agentName = "Douglas Elliman",
            mapPictureUrl = getStaticMapUrl(40.553881452248525, -73.19466925910078)
        ),
        Property(
            id = "4",
            type = PropertyType.TRIPLEX,
            price = 66000000.0,
            surface = 7130.0,
            roomsAmount = 10,
            bathroomsAmount = 2,
            bedroomsAmount = 3,
            description = "Triplex Penthouse 72 is a spectacular, one-of-a-kind penthouse residence that offers the grandeur of expansive " +
                    "indoor-outdoor living across three full floors, all with breathtaking, unobstructed 360-degree vistas that are perfectly " +
                    "centered over the entirety of Central Park to the north, and river-to-river over Manhattan's iconic city skyline to the " +
                    "south.  The triplex boasts 7,130 of beautifully finished interior sq ft with four bedrooms and five and a half bathrooms.  " +
                    "The extraordinary private loggia is 1,367 sq ft and provides for an elevated, sheltered open-air entertaining experience " +
                    "unrivalled on Central Park South",
            mediaList = listOf(
                MediaItem("4a347991-d697-41b3-948f-7f1588b364b5", "4", "https://photos.zillowstatic.com/fp/82a3ef885a3722b2483e689c1a215085-cc_ft_768.jpg" , "Living room 1", FileType.PICTURE),
                MediaItem("4a657293-4e40-4500-ab3e-badbf3d44642", "4", "https://photos.zillowstatic.com/fp/85dfc4e5f85cc500d004d390337fc69e-cc_ft_384.jpg" , "Stairs", FileType.PICTURE),
                MediaItem("1eb2140c-8b10-4876-9714-f50caf32f566", "4", "https://photos.zillowstatic.com/fp/eafb244ea6f7eebb37395a4a8095354e-cc_ft_384.jpg" , "Bathroom", FileType.PICTURE),
                MediaItem("2049fc2a-5535-43e1-bb6a-297f7436cb73", "4", "https://photos.zillowstatic.com/fp/d25ca12dc14670087a0a186ecf1a4450-cc_ft_384.jpg" , "Living room 2", FileType.PICTURE),
                MediaItem("3d7092de-5f20-47cc-b6ef-6fc49c86d67e", "4", "https://photos.zillowstatic.com/fp/bca7129277de8af2f982c78e57be11ef-cc_ft_384.jpg" , "Living room 3", FileType.PICTURE)
            ),
            addressLine1 = "111 W 57th St PENTHOUSE 72",
            city = "Manhattan",
            postalCode = "NY 10019",
            country = "USA",
            latitude = 40.76482158883576,
            longitude = -73.97782416556161,
            pointOfInterestList = listOf(
                PointOfInterest.SCHOOL,
                PointOfInterest.PARK,
                PointOfInterest.GROCERY,
                PointOfInterest.FITNESS_CLUB
            ),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 2, 6) }.timeInMillis,
            agentName = "Douglas Elliman",
            mapPictureUrl = getStaticMapUrl(40.76482158883576, -73.97782416556161)
        ),
        Property(
            id = "5",
            type = PropertyType.HOUSE,
            price = 453200.0,
            surface = 2168.0,
            roomsAmount = 10,
            bathroomsAmount = 2,
            bedroomsAmount = 3,
            description = "This is a 2 Family Semi-detached Residential that includes a Living Room / Dining Room, Eat-In Kitchen, 3 Bedrooms and " +
                    "2 Baths on the 1st Floor, and Living Room / Dining Room, Eat-In Kitchen, 3 Bedrooms and 2 Baths on the 2nd Floor. Also there is " +
                    "a Full Finished Basement and a Private Driveway. Don't miss out on the opportunity to own a home at an affordable price!!!",
            mediaList = listOf(
                MediaItem("1b07aa9d-ffa2-4e44-aeab-68f06dc74d90", "5", "https://photos.zillowstatic.com/fp/91c4571f75dbb3090154016b8b504e60-cc_ft_768.jpg" , "Facade 1", FileType.PICTURE),
                MediaItem("2c4f0a24-6da4-481e-ad83-f769812e8eaa", "5", "https://photos.zillowstatic.com/fp/ecec97465481bdde4c0b095fd6ae7119-cc_ft_384.jpg" , "Facade 2", FileType.PICTURE),
                MediaItem("222d5a8a-2a92-460b-b023-644159e21321", "5", "https://photos.zillowstatic.com/fp/edb05161a372ba4914b63f5c96cdbcd8-cc_ft_384.jpg" , "Facade 3", FileType.PICTURE)
            ),
            addressLine1 = "173-11 110th Ave, Jamaica",
            city = "Brooklyn",
            postalCode = "NY 11433",
            country = "USA",
            latitude = 40.697167874862615,
            longitude = -73.78038285309472,
            pointOfInterestList = listOf(PointOfInterest.GROCERY, PointOfInterest.PUBLIC_TRANSPORT),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 4, 15) }.timeInMillis,
            agentName = "John McLaughlin",
            mapPictureUrl = getStaticMapUrl(40.697167874862615, -73.78038285309472)
        ),
        Property(
            id = "6",
            type = PropertyType.FLAT,
            price = 295000.0,
            surface = 800.0,
            roomsAmount = 3,
            bathroomsAmount = 1,
            bedroomsAmount = 1,
            description = "This 800 square foot condo home has 2 bedrooms and 1.0 bathrooms. This home is located at 323 Edgecombe Ave APT 7, New York, NY 10031",
            mediaList = listOf(
                MediaItem("16fe027f-2e99-401f-ac3b-d2462d0083d7", "6", "https://photos.zillowstatic.com/fp/8e335a55b050bf45a3d2777fd1060659-cc_ft_768.jpg" , "Dining room", FileType.PICTURE),
                MediaItem("021a809d-c743-46ac-867c-2474ec3dc999", "6", "https://photos.zillowstatic.com/fp/85b8b974a55f0882752ad29014522770-cc_ft_384.jpg" , "Living room 1", FileType.PICTURE),
                MediaItem("75769c4d-e6ef-43c2-bc6a-41896efa9067", "6", "https://photos.zillowstatic.com/fp/58cab65439d54afab2b5121a31f1bff8-cc_ft_384.jpg" , "Living room 2", FileType.PICTURE),
                MediaItem("a4d26c1a-6630-4add-8d96-59ad97ff7681", "6", "https://photos.zillowstatic.com/fp/241437edd3e02feb8f9518f59a18d875-cc_ft_384.jpg" , "Kitchen", FileType.PICTURE)
            ),
            addressLine1 = "323 Edgecombe Ave APT 7",
            city = "Harlem",
            postalCode = "NY 10031",
            country = "USA",
            latitude = 40.82568643585645,
            longitude = -73.94261050737286,
            pointOfInterestList = listOf(
                PointOfInterest.SCHOOL,
                PointOfInterest.PUBLIC_TRANSPORT,
                PointOfInterest.PARKING,
                PointOfInterest.FITNESS_CLUB
            ),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 3, 10) }.timeInMillis,
            soldDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 8, 8) }.timeInMillis,
            agentName = "Kristen Fortino",
            mapPictureUrl = getStaticMapUrl(40.82568643585645, -73.94261050737286)
        ),
        Property(
            id = "7",
            type = PropertyType.DUPLEX,
            price = 1795000.0,
            surface = 3228.0,
            roomsAmount = 7,
            bathroomsAmount = 2,
            bedroomsAmount = 2,
            description = "A true diamond in the rough waiting for your vision to make it sparkle.\n" +
                    "This massive  detached stand alone home has over 3200sq feet of possibility.\n" +
                    "Situated on an oversized 2500sq ft lot. \n" +
                    " This 3 family house is currently configured as a 1 bedroom rental with 3 bedroom duplex above.\n" +
                    " The 1 bedroom apartment has been recently renovated and features original hardwood floors and fireplace.  The duplex above features an open floor layout for living and dining..\n" +
                    "Great light from east, west and southern exposures.\n" +
                    "Boasting a full basement with laundry and an expansive backyard- even a pool !\n" +
                    "Located in Prime Greenpoint on a picturesque tree lined block minutes from transport, restaurants, bars, shops and McCarren Park.\n" +
                    "This gem won't last - schedule your viewing today.",
            mediaList = listOf(
                MediaItem("53e6412f-60f3-42f8-8521-72648d665cd7", "7", "https://photos.zillowstatic.com/fp/f259812ea3129d47389a09ca7d51a53c-cc_ft_768.jpg" , "Facade", FileType.PICTURE),
                MediaItem("4901abbd-9be9-4a9a-927f-9f3c618d6a62", "7", "https://photos.zillowstatic.com/fp/f27d3b7c4ae9c447331dddefa79e85b3-cc_ft_384.jpg" , "Living room 1", FileType.PICTURE),
                MediaItem("a1be98d0-1bda-4e79-8a6c-adc0faa615b6", "7", "https://photos.zillowstatic.com/fp/bb4e835dc40cef310d690fae2296a972-cc_ft_384.jpg" , "Living room 2", FileType.PICTURE),
                MediaItem("11466a72-579c-4fc0-acd5-99351286af70", "7", "https://photos.zillowstatic.com/fp/cbde3883e38a4e44919cc079ace4f232-cc_ft_384.jpg" , "Hall", FileType.PICTURE),
                MediaItem("23c7a3ec-935c-476a-af9d-f85e06b05981", "7", "https://photos.zillowstatic.com/fp/f2dfb51bae1056b64b772e3b504928b5-cc_ft_384.jpg" , "Bedroom", FileType.PICTURE)
            ),
            addressLine1 = "651 Leonard St",
            city = "Greenpoint",
            postalCode = "NY 11222",
            country = "USA",
            latitude = 40.7267017136229,
            longitude = -73.95191893544883,
            pointOfInterestList = listOf(
                PointOfInterest.SCHOOL,
                PointOfInterest.PUBLIC_TRANSPORT,
                PointOfInterest.FITNESS_CLUB
            ),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 4, 20) }.timeInMillis,
            agentName = "Douglas Elliman",
            mapPictureUrl = getStaticMapUrl(40.7267017136229, -73.95191893544883)
        ),
    )
}

fun generateOnlineProperties() : List<Property> {
    return listOf(
        Property(
            id = "1",
            type = PropertyType.FLAT,
            price = 169000.0,
            surface = 900.0,
            roomsAmount = 8,
            bathroomsAmount = 1,
            bedroomsAmount = 3,
            description = "Peaceful and quiet, this approximately 900sf home has much to offer.  Spacious one bedroom with a separate " +
                    "dining alcove and a huge bedroom measuring 12x18'3. The full, windowed kitchen is original, just waiting for your " +
                    "creative touch.  This wonderful apartment has lots of storage with 3 large closets.  There are lovely, solid oak " +
                    "parquet flooring throughout.  Carnegie House is situated in the heart of midtown, steps to Central Park, Carnegie " +
                    "Hall, Lincoln Center, the Theater District and the Time Warner Center. The full service building is pet-friendly, " +
                    "has a Concierge, valet, bike room, storage, and an on-site garage in which residents receive a 25% discount. " +
                    "Pied-a-terre, parent's buying for children, and co-purchasing are allowed.  There is a monthly special assessment " +
                    "of $287.24 through 2/28/22 not included in the maintenance",
            mediaList = listOf(
                MediaItem("128af304-86e1-4796-a814-392ffc461ee7", "1", "https://photos.zillowstatic.com/fp/5f3b6091f47a36edac88ad461d7b5518-cc_ft_576.jpg", "Living room", FileType.PICTURE),
                MediaItem("2e0805f7-1fe8-4392-9952-00e8ecb75d58", "1", "https://photos.zillowstatic.com/fp/a1ac5668a4dcc1795e250b8f2779633f-o_a.jpg", "Bedroom", FileType.PICTURE)
            ),
            addressLine1 = "45 Rockefeller Plaza",
            city = "Manhattan",
            postalCode = "NY 10111",
            country = "USA",
            latitude = 40.7589408497391,
            longitude = -73.97983110154246,
            pointOfInterestList = listOf(PointOfInterest.SCHOOL, PointOfInterest.PARK),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 5, 20) }.timeInMillis,
            agentName = "John McLaughlin",
            mapPictureUrl = getStaticMapUrl(40.7589408497391, -73.97983110154246)
        ),
        Property(
            id = "2",
            type = PropertyType.FLAT,
            price = 379000.0,
            surface = 1800.0,
            roomsAmount = 8,
            bathroomsAmount = 2,
            bedroomsAmount = 2,
            description = "This is a magnificent opportunity to purchase an apartment that is requiring TLC. It is approximately 1800 " +
                    "square feet with fabulous Southeastern views overlooking the East River. One can also see full Central Park views " +
                    "as well as those of the George Washington Bridge.  The apartment contains two large Bedrooms and can even convert " +
                    "to three Bedrooms. It has 2.5 Bathrooms, a Dining Room, a windowed Kitchen and an immense central Foyer. Another " +
                    "extra special amenity is the Southern Terrace overlooking New York City's magnificent sites such as the Chrysler " +
                    "Building and the Freedom Tower. There is Central Air Conditioning, huge Closets and a spot for a Washer/Dryer. It " +
                    "is located on the 32nd floor in a luxury Building on Billionaire's row. The building contains a 20,000 sq ft Gym/Spa " +
                    "and a large indoor/outdoor salt water Pool. There is a 24 hour Garage as well a 24 hour service; consisting of concierges, " +
                    "doormen and repairmen. Pets, Pied-a-terres and sublets are allowed. A fabulous public school is located across the " +
                    "street, thus easing educational costs.",
            mediaList = listOf(
                MediaItem("112badc2-f930-414d-a3ec-2ec58fb6d512", "2", "https://photos.zillowstatic.com/fp/1e71b46abea77c70303f76af0886cc30-cc_ft_768.jpg", "Living room", FileType.PICTURE),
                MediaItem("2135e97e-fff5-4840-bb61-e7188ba37613", "2", "https://photos.zillowstatic.com/fp/d9fb3b499aee5de69f2c400c6f626d92-cc_ft_384.jpg", "Bedroom", FileType.PICTURE),
                MediaItem("26b4306a-7698-4e7e-93a1-ee5d4ade45c0", "2", "https://photos.zillowstatic.com/fp/0dfa3f33fa13c6a6b3bcbc55894de2ce-cc_ft_384.jpg", "View", FileType.PICTURE),
                MediaItem("2a5ab2dc-d789-4e4c-8f5e-2a29ef1b3200", "2", "https://photos.zillowstatic.com/fp/a60feda35e489359a1f46c34fbc31106-cc_ft_384.jpg", "Living room", FileType.PICTURE)
            ),
            addressLine1 = "303 E 57th St APT 32B",
            city = "Manhattan",
            postalCode = "NY 10022",
            country = "USA",
            latitude = 40.759524542858905,
            longitude = -73.9648487396234,
            pointOfInterestList = listOf(
                PointOfInterest.GROCERY,
                PointOfInterest.PARK,
                PointOfInterest.SWIMMING_POOL,
                PointOfInterest.PARKING,
                PointOfInterest.FITNESS_CLUB,
                PointOfInterest.PUBLIC_TRANSPORT,
                PointOfInterest.SCHOOL
            ),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 5, 18) }.timeInMillis,
            soldDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 8, 12) }.timeInMillis,
            agentName = "Kristen Fortino",
            mapPictureUrl = getStaticMapUrl(40.759524542858905, -73.9648487396234)
        ),
        Property(
            id = "3",
            type = PropertyType.HOUSE,
            price = 478500.0,
            surface = 1892.0,
            roomsAmount = 7,
            bathroomsAmount = 1,
            bedroomsAmount = 2,
            description = "Welcome to your fantasy home! Imagine owning this magical single family house and living out your dreams. " +
                    "With 3 spacious bedrooms, it’ll be like owning your own castle with plenty of space for your family and friends. " +
                    "The open kitchen layout and central air units would ensure that you, your family, and friends will always be " +
                    "comfortable as you wine and dine those happy nights away. You’ll be the subject of envy as your guests admire the " +
                    "gorgeous bamboo flooring running throughout the whole house. Not to mention, you’ll have enough bathrooms to accommodate " +
                    "your needs with 1 full bathroom on the 2nd floor and a half bathroom on the 1st floor. No longer would there be a " +
                    "need to call dibs on the bathroom in the morning! But what about parking? Fear not! There are 2 private parking spaces " +
                    "that may be used in whichever way you deem fit. If you're already imagining yourself living here, come join us to " +
                    "preview this beautiful home! Don’t let this fantastic dream pass you by!  This beautiful home is located close to " +
                    "Arden Height Woods Park where you can enjoy the fresh air and out door actives with Mother Nature. Close to school " +
                    "like P.S. 4 Maurice Wollin School and other great schools as well. Shopping areas and Restaurants are just minutes " +
                    "away. There is also a South Shore Golf Course near by for golf lover to hit some ball on a beautiful green grass. " +
                    "Did I mention there's 2 community olympic size pools? Travel is super convenient because the highway is just minutes " +
                    "away. Don’t let this fantastic dream home pass you by!",
            mediaList = listOf(
                MediaItem("64244c1d-03ce-4ae4-8c4c-00543593ca6e", "3", "https://photos.zillowstatic.com/fp/14f1984c6ec05fb7a4356e4133934aea-cc_ft_768.jpg" , "Dining room 1", FileType.PICTURE),
                MediaItem("122e9274-92b1-478d-94fc-539af0e67718", "3", "https://photos.zillowstatic.com/fp/75348e9428f0589a82cb70fe52df08bd-cc_ft_384.jpg" , "Living room", FileType.PICTURE),
                MediaItem("25ac66fc-2a4f-4e3e-8f68-9d9c14cff0d8", "3", "https://photos.zillowstatic.com/fp/d74ac5d7059bf5528659234054c21481-cc_ft_384.jpg" , "Kitchen", FileType.PICTURE),
                MediaItem("2ad5793d-f524-454a-8610-2a7465714f70", "3", "https://photos.zillowstatic.com/fp/d3e29b38f5c0a428df23d66d07cc16cd-cc_ft_384.jpg" , "Bathroom", FileType.PICTURE),
                MediaItem("105385eb-1f74-4d72-8c4b-b2dd254d5675", "3", "https://photos.zillowstatic.com/fp/d041509f327311831d711545a012c856-cc_ft_384.jpg" , "Dining room 2", FileType.PICTURE)
            ),
            addressLine1 = "32 Barclay Cir",
            city = "Staten Island",
            postalCode = "NY 10312",
            country = "USA",
            latitude = 40.553881452248525,
            longitude = -74.19466925910078,
            pointOfInterestList = listOf(
                PointOfInterest.SCHOOL,
                PointOfInterest.SWIMMING_POOL,
                PointOfInterest.PARKING,
                PointOfInterest.PUBLIC_TRANSPORT
            ),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 4, 28) }.timeInMillis,
            soldDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 8, 10) }.timeInMillis,
            agentName = "Douglas Elliman",
            mapPictureUrl = getStaticMapUrl(40.553881452248525, -73.19466925910078)
        ),
        Property(
            id = "4",
            type = PropertyType.TRIPLEX,
            price = 66000000.0,
            surface = 7130.0,
            roomsAmount = 10,
            bathroomsAmount = 2,
            bedroomsAmount = 3,
            description = "Triplex Penthouse 72 is a spectacular, one-of-a-kind penthouse residence that offers the grandeur of expansive " +
                    "indoor-outdoor living across three full floors, all with breathtaking, unobstructed 360-degree vistas that are perfectly " +
                    "centered over the entirety of Central Park to the north, and river-to-river over Manhattan's iconic city skyline to the " +
                    "south.  The triplex boasts 7,130 of beautifully finished interior sq ft with four bedrooms and five and a half bathrooms.  " +
                    "The extraordinary private loggia is 1,367 sq ft and provides for an elevated, sheltered open-air entertaining experience " +
                    "unrivalled on Central Park South",
            mediaList = listOf(
                MediaItem("4a347991-d697-41b3-948f-7f1588b364b5", "4", "https://photos.zillowstatic.com/fp/82a3ef885a3722b2483e689c1a215085-cc_ft_768.jpg" , "Living room 1", FileType.PICTURE),
                MediaItem("4a657293-4e40-4500-ab3e-badbf3d44642", "4", "https://photos.zillowstatic.com/fp/85dfc4e5f85cc500d004d390337fc69e-cc_ft_384.jpg" , "Stairs", FileType.PICTURE),
                MediaItem("1eb2140c-8b10-4876-9714-f50caf32f566", "4", "https://photos.zillowstatic.com/fp/eafb244ea6f7eebb37395a4a8095354e-cc_ft_384.jpg" , "Bathroom", FileType.PICTURE),
                MediaItem("2049fc2a-5535-43e1-bb6a-297f7436cb73", "4", "https://photos.zillowstatic.com/fp/d25ca12dc14670087a0a186ecf1a4450-cc_ft_384.jpg" , "Living room 2", FileType.PICTURE),
                MediaItem("3d7092de-5f20-47cc-b6ef-6fc49c86d67e", "4", "https://photos.zillowstatic.com/fp/bca7129277de8af2f982c78e57be11ef-cc_ft_384.jpg" , "Living room 3", FileType.PICTURE)
            ),
            addressLine1 = "111 W 57th St PENTHOUSE 72",
            city = "Manhattan",
            postalCode = "NY 10019",
            country = "USA",
            latitude = 40.76482158883576,
            longitude = -73.97782416556161,
            pointOfInterestList = listOf(
                PointOfInterest.SCHOOL,
                PointOfInterest.PARK,
                PointOfInterest.GROCERY,
                PointOfInterest.FITNESS_CLUB
            ),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 2, 6) }.timeInMillis,
            agentName = "Douglas Elliman",
            mapPictureUrl = getStaticMapUrl(40.76482158883576, -73.97782416556161)
        ),
        Property(
            id = "5",
            type = PropertyType.HOUSE,
            price = 453200.0,
            surface = 2168.0,
            roomsAmount = 10,
            bathroomsAmount = 2,
            bedroomsAmount = 3,
            description = "This is a 2 Family Semi-detached Residential that includes a Living Room / Dining Room, Eat-In Kitchen, 3 Bedrooms and " +
                    "2 Baths on the 1st Floor, and Living Room / Dining Room, Eat-In Kitchen, 3 Bedrooms and 2 Baths on the 2nd Floor. Also there is " +
                    "a Full Finished Basement and a Private Driveway. Don't miss out on the opportunity to own a home at an affordable price!!!",
            mediaList = listOf(
                MediaItem("1b07aa9d-ffa2-4e44-aeab-68f06dc74d90", "5", "https://photos.zillowstatic.com/fp/91c4571f75dbb3090154016b8b504e60-cc_ft_768.jpg" , "Facade 1", FileType.PICTURE),
                MediaItem("2c4f0a24-6da4-481e-ad83-f769812e8eaa", "5", "https://photos.zillowstatic.com/fp/ecec97465481bdde4c0b095fd6ae7119-cc_ft_384.jpg" , "Facade 2", FileType.PICTURE),
                MediaItem("222d5a8a-2a92-460b-b023-644159e21321", "5", "https://photos.zillowstatic.com/fp/edb05161a372ba4914b63f5c96cdbcd8-cc_ft_384.jpg" , "Facade 3", FileType.PICTURE)
            ),
            addressLine1 = "173-11 110th Ave, Jamaica",
            city = "Brooklyn",
            postalCode = "NY 11433",
            country = "USA",
            latitude = 40.697167874862615,
            longitude = -73.78038285309472,
            pointOfInterestList = listOf(PointOfInterest.GROCERY, PointOfInterest.PUBLIC_TRANSPORT),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 4, 15) }.timeInMillis,
            agentName = "John McLaughlin",
            mapPictureUrl = getStaticMapUrl(40.697167874862615, -73.78038285309472)
        ),
        Property(
            id = "6",
            type = PropertyType.FLAT,
            price = 295000.0,
            surface = 800.0,
            roomsAmount = 3,
            bathroomsAmount = 1,
            bedroomsAmount = 1,
            description = "This 800 square foot condo home has 2 bedrooms and 1.0 bathrooms. This home is located at 323 Edgecombe Ave APT 7, New York, NY 10031",
            mediaList = listOf(
                MediaItem("16fe027f-2e99-401f-ac3b-d2462d0083d7", "6", "https://photos.zillowstatic.com/fp/8e335a55b050bf45a3d2777fd1060659-cc_ft_768.jpg" , "Dining room", FileType.PICTURE),
                MediaItem("021a809d-c743-46ac-867c-2474ec3dc999", "6", "https://photos.zillowstatic.com/fp/85b8b974a55f0882752ad29014522770-cc_ft_384.jpg" , "Living room 1", FileType.PICTURE),
                MediaItem("75769c4d-e6ef-43c2-bc6a-41896efa9067", "6", "https://photos.zillowstatic.com/fp/58cab65439d54afab2b5121a31f1bff8-cc_ft_384.jpg" , "Living room 2", FileType.PICTURE),
                MediaItem("a4d26c1a-6630-4add-8d96-59ad97ff7681", "6", "https://photos.zillowstatic.com/fp/241437edd3e02feb8f9518f59a18d875-cc_ft_384.jpg" , "Kitchen", FileType.PICTURE)
            ),
            addressLine1 = "323 Edgecombe Ave APT 7",
            city = "Harlem",
            postalCode = "NY 10031",
            country = "USA",
            latitude = 40.82568643585645,
            longitude = -73.94261050737286,
            pointOfInterestList = listOf(
                PointOfInterest.SCHOOL,
                PointOfInterest.PUBLIC_TRANSPORT,
                PointOfInterest.PARKING,
                PointOfInterest.FITNESS_CLUB
            ),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 3, 10) }.timeInMillis,
            soldDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 8, 8) }.timeInMillis,
            agentName = "Kristen Fortino",
            mapPictureUrl = getStaticMapUrl(40.82568643585645, -73.94261050737286)
        ),
        Property(
            id = "7",
            type = PropertyType.DUPLEX,
            price = 1795000.0,
            surface = 3228.0,
            roomsAmount = 7,
            bathroomsAmount = 2,
            bedroomsAmount = 2,
            description = "A true diamond in the rough waiting for your vision to make it sparkle.\n" +
                    "This massive  detached stand alone home has over 3200sq feet of possibility.\n" +
                    "Situated on an oversized 2500sq ft lot. \n" +
                    " This 3 family house is currently configured as a 1 bedroom rental with 3 bedroom duplex above.\n" +
                    " The 1 bedroom apartment has been recently renovated and features original hardwood floors and fireplace.  The duplex above features an open floor layout for living and dining..\n" +
                    "Great light from east, west and southern exposures.\n" +
                    "Boasting a full basement with laundry and an expansive backyard- even a pool !\n" +
                    "Located in Prime Greenpoint on a picturesque tree lined block minutes from transport, restaurants, bars, shops and McCarren Park.\n" +
                    "This gem won't last - schedule your viewing today.",
            mediaList = listOf(
                MediaItem("53e6412f-60f3-42f8-8521-72648d665cd7", "7", "https://photos.zillowstatic.com/fp/f259812ea3129d47389a09ca7d51a53c-cc_ft_768.jpg" , "Facade", FileType.PICTURE),
                MediaItem("4901abbd-9be9-4a9a-927f-9f3c618d6a62", "7", "https://photos.zillowstatic.com/fp/f27d3b7c4ae9c447331dddefa79e85b3-cc_ft_384.jpg" , "Living room 1", FileType.PICTURE),
                MediaItem("a1be98d0-1bda-4e79-8a6c-adc0faa615b6", "7", "https://photos.zillowstatic.com/fp/bb4e835dc40cef310d690fae2296a972-cc_ft_384.jpg" , "Living room 2", FileType.PICTURE),
                MediaItem("11466a72-579c-4fc0-acd5-99351286af70", "7", "https://photos.zillowstatic.com/fp/cbde3883e38a4e44919cc079ace4f232-cc_ft_384.jpg" , "Hall", FileType.PICTURE),
                MediaItem("23c7a3ec-935c-476a-af9d-f85e06b05981", "7", "https://photos.zillowstatic.com/fp/f2dfb51bae1056b64b772e3b504928b5-cc_ft_384.jpg" , "Bedroom", FileType.PICTURE)
            ),
            addressLine1 = "651 Leonard St",
            city = "Greenpoint",
            postalCode = "NY 11222",
            country = "USA",
            latitude = 40.7267017136229,
            longitude = -73.95191893544883,
            pointOfInterestList = listOf(
                PointOfInterest.SCHOOL,
                PointOfInterest.PUBLIC_TRANSPORT,
                PointOfInterest.FITNESS_CLUB
            ),
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 4, 20) }.timeInMillis,
            agentName = "Douglas Elliman",
            mapPictureUrl = getStaticMapUrl(40.7267017136229, -73.95191893544883)
        ),
        Property(
            id = "101",
            type = PropertyType.FLAT,
            price = 295000.0,
            surface = 800.0,
            roomsAmount = 3,
            bathroomsAmount = 1,
            bedroomsAmount = 1,
            description = "This 800 square foot condo home has 2 bedrooms and 1.0 bathrooms. This home is located at 323 Edgecombe Ave APT 7, New York, NY 10031",
            addressLine1 = "323 Edgecombe Ave APT 7",
            city = "Harlem",
            postalCode = "NY 10031",
            country = "USA",
            latitude = 40.82568643585645,
            longitude = -73.94261050737286,
            postDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 3, 10) }.timeInMillis,
            soldDate = Calendar.getInstance().also {
                it.timeInMillis = 0
                it.set(2021, 8, 8) }.timeInMillis,
            agentName = "Kristen Fortino",
            mapPictureUrl = getStaticMapUrl(40.82568643585645, -73.94261050737286),
            mediaList = listOf(
                MediaItem("51466a72-579c-4fc0-acd5-99351286bf6f", "101", "https://photos.zillowstatic.com/fp/cbde3883e38a4e44919cc079ace4f232-cc_ft_384.jpg" , "Hall", FileType.PICTURE)
            ),
            pointOfInterestList = listOf(
                PointOfInterest.SCHOOL,
                PointOfInterest.GROCERY
            )
        )
    )
}