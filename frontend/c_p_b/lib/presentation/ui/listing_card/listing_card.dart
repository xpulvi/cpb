import 'package:flutter/material.dart';
import 'package:c_p_b/presentation/styles/colors.dart';
import 'package:c_p_b/presentation/styles/dimens.dart';
import 'package:c_p_b/presentation/ui/listing_card/listing_info_view.dart';
import 'package:c_p_b/presentation/ui/listing_card/listing_photo_view.dart';
import 'package:c_p_b/presentation/ui/listing_card/listing_service_view.dart';
import 'package:c_p_b/presentation/ui/listing_card/listing_stat_view.dart';

class ListingCard extends StatelessWidget {
  const ListingCard({
    super.key,
    required this.status,
    required this.imageUrl,
    required this.name,
    required this.location,
    required this.price,
    required this.beds,
    required this.baths,
    required this.size,
    required this.tokenPrice,
    required this.projectIrr,
    required this.projectApr,
  });

  final String status;
  final String imageUrl;
  final String name;
  final String location;
  final int price;
  final int beds;
  final int baths;
  final int size;
  final int tokenPrice;
  final double projectIrr;
  final double projectApr;

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: EdgeInsets.all(kPaddingBig),
      margin: EdgeInsets.all(kMarginMain),
      decoration: BoxDecoration(
        color: Colors.white,
        borderRadius: BorderRadius.circular(kRadiusBig),
        boxShadow: [
          BoxShadow(
            color: Colors.black.withAlpha(20),
            blurRadius: 10,
            offset: Offset(0, 2),
          ),
        ],
      ),
      child: Column(
        spacing: kSpaceHuge,
        children: [
          ListingPhotoView(status: status, imageUrl: imageUrl),
          ListingInfoView(name: name, location: location, price: price),
          Row(
            mainAxisAlignment: MainAxisAlignment.start,
            spacing: kSpaceHuge,
            children: [
              ListingServiceView(icon: Icons.bed_outlined, info: beds),
              ListingServiceView(icon: Icons.bathtub_outlined, info: baths),
              ListingServiceView(
                icon: Icons.crop_landscape_outlined,
                info: size,
              ),
            ],
          ),
          Container(
            padding: EdgeInsets.all(kPaddingTiny),
            decoration: BoxDecoration(
              color: kBrandColorPrimary.withAlpha(50),
              borderRadius: BorderRadius.circular(kRadiusMain),
            ),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                ListingStatView(title: "Token Price", value: "\$$tokenPrice"),
                ListingStatView(title: "Projected IRR", value: "$projectIrr%"),
                ListingStatView(title: "Projected APR", value: "$projectApr%"),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
