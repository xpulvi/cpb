import 'database.dart';

class DatabaseRepository {
  static final DatabaseRepository _instance = DatabaseRepository._internal();
  late final AppDatabase _db;

  DatabaseRepository._internal();

  factory DatabaseRepository() {
    return _instance;
  }

  Future<void> init() async {
    _db = AppDatabase();
  }

  AppDatabase get db => _db;

  Future<int> insertLink({
    required String title,
    required String link,
    required String category,
    required DateTime dateTime,
  }) async {
    return await _db
        .into(_db.linkStorage)
        .insert(
          LinkStorageCompanion.insert(
            title: title,
            link: link,
            category: category,
            createdAt: dateTime,
          ),
        );
  }

  Future<List<LinkStorageData>> getAllLinks() async {
    return await _db.select(_db.linkStorage).get();
  }

  Future<bool> deleteLink(int id) async {
    return await (_db.delete(_db.linkStorage)
          ..where((tbl) => tbl.id.equals(id)))
        .go()
        .then((rowsAffected) => rowsAffected > 0);
  }

  Future<void> clearLinks() async {
    await _db.delete(_db.linkStorage).go();
  }
}
