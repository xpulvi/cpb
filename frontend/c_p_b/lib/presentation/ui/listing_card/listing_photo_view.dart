import 'package:flutter/material.dart';
import 'package:c_p_b/presentation/styles/dimens.dart';

class ListingPhotoView extends StatelessWidget {
  const ListingPhotoView({
    super.key,
    required this.status,
    required this.imageUrl,
  });

  final String status;
  final String imageUrl;

  @override
  Widget build(BuildContext context) {
    double iconSize = 24;

    return Stack(
      children: [
        SizedBox(
          height: 200,
          width: double.infinity,
          child: ClipRRect(
            borderRadius: BorderRadius.circular(kRadiusMain),
            child: Image.network(imageUrl, fit: BoxFit.cover),
          ),
        ),
        Positioned(
          left: kSpaceMain,
          top: kSpaceMain,
          child: Container(
            padding: EdgeInsets.symmetric(
              horizontal: kPaddingMain,
              vertical: kPaddingSmall,
            ),
            decoration: BoxDecoration(
              color: Colors.white,
              borderRadius: BorderRadius.circular(kRadiusMain * 2),
            ),
            child: Text(
              status,
              style: TextStyle(
                color: Colors.black,
                fontSize: 12,
                fontWeight: FontWeight.w500,
              ),
            ),
          ),
        ),
        Positioned(
          right: kSpaceMain,
          bottom: kSpaceMain,
          child: Icon(
            Icons.favorite_outline,
            color: Colors.white,
            size: iconSize,
          ),
        ),
        Positioned(
          right: kSpaceMain,
          bottom: kSpaceMain * 2 + iconSize,
          child: Icon(Icons.link, color: Colors.white, size: iconSize),
        ),
      ],
    );
  }
}
