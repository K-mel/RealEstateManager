package com.openclassrooms.realestatemanager.extensions

import com.openclassrooms.realestatemanager.models.Estate
import com.openclassrooms.realestatemanager.models.EstateTypes
import com.openclassrooms.realestatemanager.models.PointsOfInterests

fun generateEstates() : List<Estate> {
    return listOf(
        Estate(id = "1",
            type = EstateTypes.FLAT,
            price = 169000,
            area = 900,
            roomsAmount = 8,
            description = "Peaceful and quiet, this approximately 900sf home has much to offer.  Spacious one bedroom with a separate " +
                    "dining alcove and a huge bedroom measuring 12x18'3. The full, windowed kitchen is original, just waiting for your " +
                    "creative touch.  This wonderful apartment has lots of storage with 3 large closets.  There are lovely, solid oak " +
                    "parquet flooring throughout.  Carnegie House is situated in the heart of midtown, steps to Central Park, Carnegie " +
                    "Hall, Lincoln Center, the Theater District and the Time Warner Center. The full service building is pet-friendly, " +
                    "has a Concierge, valet, bike room, storage, and an on-site garage in which residents receive a 25% discount. " +
                    "Pied-a-terre, parent's buying for children, and co-purchasing are allowed.  There is a monthly special assessment " +
                    "of $287.24 through 2/28/22 not included in the maintenance",
            picturesUriList = listOf(
                "https://photos.zillowstatic.com/fp/5f3b6091f47a36edac88ad461d7b5518-cc_ft_576.jpg",
                "https://photos.zillowstatic.com/fp/a1ac5668a4dcc1795e250b8f2779633f-o_a.webp"
            ),
            address = "45 Rockefeller Plaza",
            city = "Manhathan",
            postalCode = "NY 10111",
            country = "USA",
            pointOfInterest = listOf(PointsOfInterests.SCHOOL, PointsOfInterests.PARK),
            available = true,
            //saleDate = Calendar.getInstance().set(2021, 5, 20) as Calendar,
            agentName = "John McLaughlin"
        ),
        Estate(id = "2",
            type = EstateTypes.FLAT,
            price = 379000,
            area = 1800,
            roomsAmount = 8,
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
            picturesUriList = listOf(
                "https://photos.zillowstatic.com/fp/1e71b46abea77c70303f76af0886cc30-cc_ft_768.jpg",
                "https://photos.zillowstatic.com/fp/d9fb3b499aee5de69f2c400c6f626d92-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/0dfa3f33fa13c6a6b3bcbc55894de2ce-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/a60feda35e489359a1f46c34fbc31106-cc_ft_384.jpg"
            ),
            address = "303 E 57th St APT 32B",
            city = "Manhathan",
            postalCode = "NY 10022",
            country = "USA",
            pointOfInterest = listOf(PointsOfInterests.GROCERY, PointsOfInterests.PARK, PointsOfInterests.SWIMMING_POOL),
            available = true,
            //saleDate = Calendar.getInstance().set(2021, 5, 20) as Calendar,
            agentName = "Kristen Fortino"
        ),
        Estate(id = "3",
            type = EstateTypes.HOUSE,
            price = 478500,
            area = 1892,
            roomsAmount = 7,
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
            picturesUriList = listOf(
                "https://photos.zillowstatic.com/fp/14f1984c6ec05fb7a4356e4133934aea-cc_ft_768.jpg",
                "https://photos.zillowstatic.com/fp/75348e9428f0589a82cb70fe52df08bd-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/d74ac5d7059bf5528659234054c21481-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/d3e29b38f5c0a428df23d66d07cc16cd-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/d041509f327311831d711545a012c856-cc_ft_384.jpg"
            ),
            address = "32 Barclay Cir",
            city = "Staten Island",
            postalCode = "NY 10312",
            country = "USA",
            pointOfInterest = listOf(PointsOfInterests.SCHOOL, PointsOfInterests.TRAIN_STATION, PointsOfInterests.PUBLIC_TRANSPORT),
            available = true,
            //saleDate = Calendar.getInstance().set(2021, 5, 20) as Calendar,
            agentName = "Douglas Elliman"
        ),
        Estate(id = "4",
            type = EstateTypes.TRIPLEX,
            price = 66000000,
            area = 7130,
            roomsAmount = 10,
            description = "Triplex Penthouse 72 is a spectacular, one-of-a-kind penthouse residence that offers the grandeur of expansive " +
                    "indoor-outdoor living across three full floors, all with breathtaking, unobstructed 360-degree vistas that are perfectly " +
                    "centered over the entirety of Central Park to the north, and river-to-river over Manhattan's iconic city skyline to the " +
                    "south.  The triplex boasts 7,130 of beautifully finished interior sq ft with four bedrooms and five and a half bathrooms.  " +
                    "The extraordinary private loggia is 1,367 sq ft and provides for an elevated, sheltered open-air entertaining experience " +
                    "unrivalled on Central Park South",
            picturesUriList = listOf(
                "https://photos.zillowstatic.com/fp/82a3ef885a3722b2483e689c1a215085-cc_ft_768.jpg",
                "https://photos.zillowstatic.com/fp/85dfc4e5f85cc500d004d390337fc69e-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/eafb244ea6f7eebb37395a4a8095354e-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/d25ca12dc14670087a0a186ecf1a4450-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/bca7129277de8af2f982c78e57be11ef-cc_ft_384.jpg"
            ),
            address = "111 W 57th St PENTHOUSE 72",
            city = "Manhathan",
            postalCode = "NY 10019",
            country = "USA",
            pointOfInterest = listOf(PointsOfInterests.SCHOOL, PointsOfInterests.PARK, PointsOfInterests.GROCERY, PointsOfInterests.FITNESS_CLUB),
            available = true,
            //saleDate = Calendar.getInstance().set(2021, 5, 20) as Calendar,
            agentName = "Douglas Elliman"
        ),
        Estate(id = "5",
            type = EstateTypes.HOUSE,
            price = 453200,
            area = 2168,
            roomsAmount = 10,
            description = "This is a 2 Family Semi-detached Residential that includes a Living Room / Dining Room, Eat-In Kitchen, 3 Bedrooms and " +
                    "2 Baths on the 1st Floor, and Living Room / Dining Room, Eat-In Kitchen, 3 Bedrooms and 2 Baths on the 2nd Floor. Also there is " +
                    "a Full Finished Basement and a Private Driveway. Don't miss out on the opportunity to own a home at an affordable price!!!",
            picturesUriList = listOf(
                "https://photos.zillowstatic.com/fp/91c4571f75dbb3090154016b8b504e60-cc_ft_768.jpg",
                "https://photos.zillowstatic.com/fp/ecec97465481bdde4c0b095fd6ae7119-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/edb05161a372ba4914b63f5c96cdbcd8-cc_ft_384.jpg"
            ),
            address = "173-11 110th Ave, Jamaica",
            city = "Brooklyn",
            postalCode = "NY 11433",
            country = "USA",
            pointOfInterest = listOf(PointsOfInterests.GROCERY, PointsOfInterests.PUBLIC_TRANSPORT),
            available = true,
            //saleDate = Calendar.getInstance().set(2021, 5, 20) as Calendar,
            agentName = "John McLaughlin"
        ),
        Estate(id = "6",
            type = EstateTypes.FLAT,
            price = 295000,
            area = 800,
            roomsAmount = 3,
            description = "This 800 square foot condo home has 2 bedrooms and 1.0 bathrooms. This home is located at 323 Edgecombe Ave APT 7, New York, NY 10031",
            picturesUriList = listOf(
                "https://photos.zillowstatic.com/fp/8e335a55b050bf45a3d2777fd1060659-cc_ft_768.jpg",
                "https://photos.zillowstatic.com/fp/85b8b974a55f0882752ad29014522770-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/58cab65439d54afab2b5121a31f1bff8-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/241437edd3e02feb8f9518f59a18d875-cc_ft_384.jpg"
            ),
            address = "323 Edgecombe Ave APT 7",
            city = "Harlem",
            postalCode = "NY 10031",
            country = "USA",
            pointOfInterest = listOf(PointsOfInterests.SCHOOL, PointsOfInterests.PUBLIC_TRANSPORT, PointsOfInterests.FITNESS_CLUB),
            available = true,
            //saleDate = Calendar.getInstance().set(2021, 5, 20) as Calendar,
            agentName = "Kristen Fortino"
        ),
        Estate(id = "7",
            type = EstateTypes.DUPLEX,
            price = 1795000,
            area = 3228,
            roomsAmount = 7,
            description = "A true diamond in the rough waiting for your vision to make it sparkle.\n" +
                    "This massive  detached stand alone home has over 3200sq feet of possibility.\n" +
                    "Situated on an oversized 2500sq ft lot. \n" +
                    " This 3 family house is currently configured as a 1 bedroom rental with 3 bedroom duplex above.\n" +
                    " The 1 bedroom apartment has been recently renovated and features original hardwood floors and fireplace.  The duplex above features an open floor layout for living and dining..\n" +
                    "Great light from east, west and southern exposures.\n" +
                    "Boasting a full basement with laundry and an expansive backyard- even a pool !\n" +
                    "Located in Prime Greenpoint on a picturesque tree lined block minutes from transport, restaurants, bars, shops and McCarren Park.\n" +
                    "This gem won't last - schedule your viewing today.",
            picturesUriList = listOf(
                "https://photos.zillowstatic.com/fp/f259812ea3129d47389a09ca7d51a53c-cc_ft_768.jpg",
                "https://photos.zillowstatic.com/fp/f27d3b7c4ae9c447331dddefa79e85b3-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/bb4e835dc40cef310d690fae2296a972-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/cbde3883e38a4e44919cc079ace4f232-cc_ft_384.jpg",
                "https://photos.zillowstatic.com/fp/f2dfb51bae1056b64b772e3b504928b5-cc_ft_384.jpg"
            ),
            address = "651 Leonard St",
            city = "Eastpoint",
            postalCode = "NY 11222",
            country = "USA",
            pointOfInterest = listOf(PointsOfInterests.SCHOOL, PointsOfInterests.PUBLIC_TRANSPORT, PointsOfInterests.FITNESS_CLUB),
            available = true,
            //saleDate = Calendar.getInstance().set(2021, 5, 20) as Calendar,
            agentName = "Douglas Elliman"
        )
    )
}