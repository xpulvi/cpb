// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'database.dart';

// ignore_for_file: type=lint
class $LinkStorageTable extends LinkStorage
    with TableInfo<$LinkStorageTable, LinkStorageData> {
  @override
  final GeneratedDatabase attachedDatabase;
  final String? _alias;
  $LinkStorageTable(this.attachedDatabase, [this._alias]);
  static const VerificationMeta _idMeta = const VerificationMeta('id');
  @override
  late final GeneratedColumn<int> id = GeneratedColumn<int>(
    'id',
    aliasedName,
    false,
    hasAutoIncrement: true,
    type: DriftSqlType.int,
    requiredDuringInsert: false,
    defaultConstraints: GeneratedColumn.constraintIsAlways(
      'PRIMARY KEY AUTOINCREMENT',
    ),
  );
  static const VerificationMeta _titleMeta = const VerificationMeta('title');
  @override
  late final GeneratedColumn<String> title = GeneratedColumn<String>(
    'title',
    aliasedName,
    false,
    type: DriftSqlType.string,
    requiredDuringInsert: true,
  );
  static const VerificationMeta _linkMeta = const VerificationMeta('link');
  @override
  late final GeneratedColumn<String> link = GeneratedColumn<String>(
    'link',
    aliasedName,
    false,
    type: DriftSqlType.string,
    requiredDuringInsert: true,
  );
  static const VerificationMeta _categoryMeta = const VerificationMeta(
    'category',
  );
  @override
  late final GeneratedColumn<String> category = GeneratedColumn<String>(
    'category',
    aliasedName,
    false,
    type: DriftSqlType.string,
    requiredDuringInsert: true,
  );
  static const VerificationMeta _createdAtMeta = const VerificationMeta(
    'createdAt',
  );
  @override
  late final GeneratedColumn<DateTime> createdAt = GeneratedColumn<DateTime>(
    'created_at',
    aliasedName,
    false,
    type: DriftSqlType.dateTime,
    requiredDuringInsert: true,
  );
  @override
  List<GeneratedColumn> get $columns => [id, title, link, category, createdAt];
  @override
  String get aliasedName => _alias ?? actualTableName;
  @override
  String get actualTableName => $name;
  static const String $name = 'link_storage';
  @override
  VerificationContext validateIntegrity(
    Insertable<LinkStorageData> instance, {
    bool isInserting = false,
  }) {
    final context = VerificationContext();
    final data = instance.toColumns(true);
    if (data.containsKey('id')) {
      context.handle(_idMeta, id.isAcceptableOrUnknown(data['id']!, _idMeta));
    }
    if (data.containsKey('title')) {
      context.handle(
        _titleMeta,
        title.isAcceptableOrUnknown(data['title']!, _titleMeta),
      );
    } else if (isInserting) {
      context.missing(_titleMeta);
    }
    if (data.containsKey('link')) {
      context.handle(
        _linkMeta,
        link.isAcceptableOrUnknown(data['link']!, _linkMeta),
      );
    } else if (isInserting) {
      context.missing(_linkMeta);
    }
    if (data.containsKey('category')) {
      context.handle(
        _categoryMeta,
        category.isAcceptableOrUnknown(data['category']!, _categoryMeta),
      );
    } else if (isInserting) {
      context.missing(_categoryMeta);
    }
    if (data.containsKey('created_at')) {
      context.handle(
        _createdAtMeta,
        createdAt.isAcceptableOrUnknown(data['created_at']!, _createdAtMeta),
      );
    } else if (isInserting) {
      context.missing(_createdAtMeta);
    }
    return context;
  }

  @override
  Set<GeneratedColumn> get $primaryKey => {id};
  @override
  LinkStorageData map(Map<String, dynamic> data, {String? tablePrefix}) {
    final effectivePrefix = tablePrefix != null ? '$tablePrefix.' : '';
    return LinkStorageData(
      id: attachedDatabase.typeMapping.read(
        DriftSqlType.int,
        data['${effectivePrefix}id'],
      )!,
      title: attachedDatabase.typeMapping.read(
        DriftSqlType.string,
        data['${effectivePrefix}title'],
      )!,
      link: attachedDatabase.typeMapping.read(
        DriftSqlType.string,
        data['${effectivePrefix}link'],
      )!,
      category: attachedDatabase.typeMapping.read(
        DriftSqlType.string,
        data['${effectivePrefix}category'],
      )!,
      createdAt: attachedDatabase.typeMapping.read(
        DriftSqlType.dateTime,
        data['${effectivePrefix}created_at'],
      )!,
    );
  }

  @override
  $LinkStorageTable createAlias(String alias) {
    return $LinkStorageTable(attachedDatabase, alias);
  }
}

class LinkStorageData extends DataClass implements Insertable<LinkStorageData> {
  final int id;
  final String title;
  final String link;
  final String category;
  final DateTime createdAt;
  const LinkStorageData({
    required this.id,
    required this.title,
    required this.link,
    required this.category,
    required this.createdAt,
  });
  @override
  Map<String, Expression> toColumns(bool nullToAbsent) {
    final map = <String, Expression>{};
    map['id'] = Variable<int>(id);
    map['title'] = Variable<String>(title);
    map['link'] = Variable<String>(link);
    map['category'] = Variable<String>(category);
    map['created_at'] = Variable<DateTime>(createdAt);
    return map;
  }

  LinkStorageCompanion toCompanion(bool nullToAbsent) {
    return LinkStorageCompanion(
      id: Value(id),
      title: Value(title),
      link: Value(link),
      category: Value(category),
      createdAt: Value(createdAt),
    );
  }

  factory LinkStorageData.fromJson(
    Map<String, dynamic> json, {
    ValueSerializer? serializer,
  }) {
    serializer ??= driftRuntimeOptions.defaultSerializer;
    return LinkStorageData(
      id: serializer.fromJson<int>(json['id']),
      title: serializer.fromJson<String>(json['title']),
      link: serializer.fromJson<String>(json['link']),
      category: serializer.fromJson<String>(json['category']),
      createdAt: serializer.fromJson<DateTime>(json['createdAt']),
    );
  }
  @override
  Map<String, dynamic> toJson({ValueSerializer? serializer}) {
    serializer ??= driftRuntimeOptions.defaultSerializer;
    return <String, dynamic>{
      'id': serializer.toJson<int>(id),
      'title': serializer.toJson<String>(title),
      'link': serializer.toJson<String>(link),
      'category': serializer.toJson<String>(category),
      'createdAt': serializer.toJson<DateTime>(createdAt),
    };
  }

  LinkStorageData copyWith({
    int? id,
    String? title,
    String? link,
    String? category,
    DateTime? createdAt,
  }) => LinkStorageData(
    id: id ?? this.id,
    title: title ?? this.title,
    link: link ?? this.link,
    category: category ?? this.category,
    createdAt: createdAt ?? this.createdAt,
  );
  LinkStorageData copyWithCompanion(LinkStorageCompanion data) {
    return LinkStorageData(
      id: data.id.present ? data.id.value : this.id,
      title: data.title.present ? data.title.value : this.title,
      link: data.link.present ? data.link.value : this.link,
      category: data.category.present ? data.category.value : this.category,
      createdAt: data.createdAt.present ? data.createdAt.value : this.createdAt,
    );
  }

  @override
  String toString() {
    return (StringBuffer('LinkStorageData(')
          ..write('id: $id, ')
          ..write('title: $title, ')
          ..write('link: $link, ')
          ..write('category: $category, ')
          ..write('createdAt: $createdAt')
          ..write(')'))
        .toString();
  }

  @override
  int get hashCode => Object.hash(id, title, link, category, createdAt);
  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      (other is LinkStorageData &&
          other.id == this.id &&
          other.title == this.title &&
          other.link == this.link &&
          other.category == this.category &&
          other.createdAt == this.createdAt);
}

class LinkStorageCompanion extends UpdateCompanion<LinkStorageData> {
  final Value<int> id;
  final Value<String> title;
  final Value<String> link;
  final Value<String> category;
  final Value<DateTime> createdAt;
  const LinkStorageCompanion({
    this.id = const Value.absent(),
    this.title = const Value.absent(),
    this.link = const Value.absent(),
    this.category = const Value.absent(),
    this.createdAt = const Value.absent(),
  });
  LinkStorageCompanion.insert({
    this.id = const Value.absent(),
    required String title,
    required String link,
    required String category,
    required DateTime createdAt,
  }) : title = Value(title),
       link = Value(link),
       category = Value(category),
       createdAt = Value(createdAt);
  static Insertable<LinkStorageData> custom({
    Expression<int>? id,
    Expression<String>? title,
    Expression<String>? link,
    Expression<String>? category,
    Expression<DateTime>? createdAt,
  }) {
    return RawValuesInsertable({
      if (id != null) 'id': id,
      if (title != null) 'title': title,
      if (link != null) 'link': link,
      if (category != null) 'category': category,
      if (createdAt != null) 'created_at': createdAt,
    });
  }

  LinkStorageCompanion copyWith({
    Value<int>? id,
    Value<String>? title,
    Value<String>? link,
    Value<String>? category,
    Value<DateTime>? createdAt,
  }) {
    return LinkStorageCompanion(
      id: id ?? this.id,
      title: title ?? this.title,
      link: link ?? this.link,
      category: category ?? this.category,
      createdAt: createdAt ?? this.createdAt,
    );
  }

  @override
  Map<String, Expression> toColumns(bool nullToAbsent) {
    final map = <String, Expression>{};
    if (id.present) {
      map['id'] = Variable<int>(id.value);
    }
    if (title.present) {
      map['title'] = Variable<String>(title.value);
    }
    if (link.present) {
      map['link'] = Variable<String>(link.value);
    }
    if (category.present) {
      map['category'] = Variable<String>(category.value);
    }
    if (createdAt.present) {
      map['created_at'] = Variable<DateTime>(createdAt.value);
    }
    return map;
  }

  @override
  String toString() {
    return (StringBuffer('LinkStorageCompanion(')
          ..write('id: $id, ')
          ..write('title: $title, ')
          ..write('link: $link, ')
          ..write('category: $category, ')
          ..write('createdAt: $createdAt')
          ..write(')'))
        .toString();
  }
}

abstract class _$AppDatabase extends GeneratedDatabase {
  _$AppDatabase(QueryExecutor e) : super(e);
  $AppDatabaseManager get managers => $AppDatabaseManager(this);
  late final $LinkStorageTable linkStorage = $LinkStorageTable(this);
  @override
  Iterable<TableInfo<Table, Object?>> get allTables =>
      allSchemaEntities.whereType<TableInfo<Table, Object?>>();
  @override
  List<DatabaseSchemaEntity> get allSchemaEntities => [linkStorage];
}

typedef $$LinkStorageTableCreateCompanionBuilder =
    LinkStorageCompanion Function({
      Value<int> id,
      required String title,
      required String link,
      required String category,
      required DateTime createdAt,
    });
typedef $$LinkStorageTableUpdateCompanionBuilder =
    LinkStorageCompanion Function({
      Value<int> id,
      Value<String> title,
      Value<String> link,
      Value<String> category,
      Value<DateTime> createdAt,
    });

class $$LinkStorageTableFilterComposer
    extends Composer<_$AppDatabase, $LinkStorageTable> {
  $$LinkStorageTableFilterComposer({
    required super.$db,
    required super.$table,
    super.joinBuilder,
    super.$addJoinBuilderToRootComposer,
    super.$removeJoinBuilderFromRootComposer,
  });
  ColumnFilters<int> get id => $composableBuilder(
    column: $table.id,
    builder: (column) => ColumnFilters(column),
  );

  ColumnFilters<String> get title => $composableBuilder(
    column: $table.title,
    builder: (column) => ColumnFilters(column),
  );

  ColumnFilters<String> get link => $composableBuilder(
    column: $table.link,
    builder: (column) => ColumnFilters(column),
  );

  ColumnFilters<String> get category => $composableBuilder(
    column: $table.category,
    builder: (column) => ColumnFilters(column),
  );

  ColumnFilters<DateTime> get createdAt => $composableBuilder(
    column: $table.createdAt,
    builder: (column) => ColumnFilters(column),
  );
}

class $$LinkStorageTableOrderingComposer
    extends Composer<_$AppDatabase, $LinkStorageTable> {
  $$LinkStorageTableOrderingComposer({
    required super.$db,
    required super.$table,
    super.joinBuilder,
    super.$addJoinBuilderToRootComposer,
    super.$removeJoinBuilderFromRootComposer,
  });
  ColumnOrderings<int> get id => $composableBuilder(
    column: $table.id,
    builder: (column) => ColumnOrderings(column),
  );

  ColumnOrderings<String> get title => $composableBuilder(
    column: $table.title,
    builder: (column) => ColumnOrderings(column),
  );

  ColumnOrderings<String> get link => $composableBuilder(
    column: $table.link,
    builder: (column) => ColumnOrderings(column),
  );

  ColumnOrderings<String> get category => $composableBuilder(
    column: $table.category,
    builder: (column) => ColumnOrderings(column),
  );

  ColumnOrderings<DateTime> get createdAt => $composableBuilder(
    column: $table.createdAt,
    builder: (column) => ColumnOrderings(column),
  );
}

class $$LinkStorageTableAnnotationComposer
    extends Composer<_$AppDatabase, $LinkStorageTable> {
  $$LinkStorageTableAnnotationComposer({
    required super.$db,
    required super.$table,
    super.joinBuilder,
    super.$addJoinBuilderToRootComposer,
    super.$removeJoinBuilderFromRootComposer,
  });
  GeneratedColumn<int> get id =>
      $composableBuilder(column: $table.id, builder: (column) => column);

  GeneratedColumn<String> get title =>
      $composableBuilder(column: $table.title, builder: (column) => column);

  GeneratedColumn<String> get link =>
      $composableBuilder(column: $table.link, builder: (column) => column);

  GeneratedColumn<String> get category =>
      $composableBuilder(column: $table.category, builder: (column) => column);

  GeneratedColumn<DateTime> get createdAt =>
      $composableBuilder(column: $table.createdAt, builder: (column) => column);
}

class $$LinkStorageTableTableManager
    extends
        RootTableManager<
          _$AppDatabase,
          $LinkStorageTable,
          LinkStorageData,
          $$LinkStorageTableFilterComposer,
          $$LinkStorageTableOrderingComposer,
          $$LinkStorageTableAnnotationComposer,
          $$LinkStorageTableCreateCompanionBuilder,
          $$LinkStorageTableUpdateCompanionBuilder,
          (
            LinkStorageData,
            BaseReferences<_$AppDatabase, $LinkStorageTable, LinkStorageData>,
          ),
          LinkStorageData,
          PrefetchHooks Function()
        > {
  $$LinkStorageTableTableManager(_$AppDatabase db, $LinkStorageTable table)
    : super(
        TableManagerState(
          db: db,
          table: table,
          createFilteringComposer: () =>
              $$LinkStorageTableFilterComposer($db: db, $table: table),
          createOrderingComposer: () =>
              $$LinkStorageTableOrderingComposer($db: db, $table: table),
          createComputedFieldComposer: () =>
              $$LinkStorageTableAnnotationComposer($db: db, $table: table),
          updateCompanionCallback:
              ({
                Value<int> id = const Value.absent(),
                Value<String> title = const Value.absent(),
                Value<String> link = const Value.absent(),
                Value<String> category = const Value.absent(),
                Value<DateTime> createdAt = const Value.absent(),
              }) => LinkStorageCompanion(
                id: id,
                title: title,
                link: link,
                category: category,
                createdAt: createdAt,
              ),
          createCompanionCallback:
              ({
                Value<int> id = const Value.absent(),
                required String title,
                required String link,
                required String category,
                required DateTime createdAt,
              }) => LinkStorageCompanion.insert(
                id: id,
                title: title,
                link: link,
                category: category,
                createdAt: createdAt,
              ),
          withReferenceMapper: (p0) => p0
              .map((e) => (e.readTable(table), BaseReferences(db, table, e)))
              .toList(),
          prefetchHooksCallback: null,
        ),
      );
}

typedef $$LinkStorageTableProcessedTableManager =
    ProcessedTableManager<
      _$AppDatabase,
      $LinkStorageTable,
      LinkStorageData,
      $$LinkStorageTableFilterComposer,
      $$LinkStorageTableOrderingComposer,
      $$LinkStorageTableAnnotationComposer,
      $$LinkStorageTableCreateCompanionBuilder,
      $$LinkStorageTableUpdateCompanionBuilder,
      (
        LinkStorageData,
        BaseReferences<_$AppDatabase, $LinkStorageTable, LinkStorageData>,
      ),
      LinkStorageData,
      PrefetchHooks Function()
    >;

class $AppDatabaseManager {
  final _$AppDatabase _db;
  $AppDatabaseManager(this._db);
  $$LinkStorageTableTableManager get linkStorage =>
      $$LinkStorageTableTableManager(_db, _db.linkStorage);
}
